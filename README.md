meta-kde-demo
=============

This layer is not meant for production use, but merely contains a demo setup
for a Plasma Mobile based shell to showcase and test KF5 and Plasma usage in a
Yocto system.

Getting Started
===============

Refer to the manifest files in https://invent.kde.org/packaging/yocto-manifest
for tracking tested combinations of Yocto layers. The manifest names are
organized according to the supported Yocto upstream layers.

For starting from a given manifest, just enter an empty folder and run:

```
curl https://storage.googleapis.com/git-repo-downloads/repo > repo
chmod +x repo

./repo init \
    -u https://invent.kde.org/packaging/yocto-manifest.git \
    -m default.xml
./repo sync
```

Second, configure the Yocto build and start Bitbake:

```
MACHINE=raspberrypi4 . ./setup-environment
bitbake kde-demo-image
```
