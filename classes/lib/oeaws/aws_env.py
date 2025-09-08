# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2019-2020 Matthew Madison <matt@madison.systems>
#
# this file was imported from: https://github.com/madisongh/tegra-test-distro
"""
Fix AWS env for S3 fetcher
Extracted from botos3fetcher in order to be used in bbclass too
"""
import os

import bb

awsvars = [ 'AWS_CONFIG_FILE',
            'AWS_PROFILE',
            'AWS_ACCESS_KEY_ID',
            'AWS_SECRET_ACCESS_KEY',
            'AWS_SHARED_CREDENTIALS_FILE',
            'AWS_SESSION_TOKEN',
            'AWS_DEFAULT_REGION',
            'AWS_METADATA_SERVICE_NUM_ATTEMPTS',
            'AWS_METADATA_SERVICE_TIMEOUT']

def fix_env(d):
    origenv = d.getVar('BB_ORIGENV', False)
    for v in awsvars:
        val = os.getenv(v)
        if val:
            bb.debug(2, "Have %s=%s in env" % (v, val))
            continue
        val = origenv and origenv.getVar(v)
        if val:
            os.environ[v] = val
            bb.debug(2, 'Set %s=%s in env' % (v, val))
        bb.debug(2, 'No setting for %s' % v)
