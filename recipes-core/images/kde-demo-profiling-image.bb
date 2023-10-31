LICENSE = "MIT"

include recipes-core/images/kde-demo-image.bb

EXTRA_IMAGE_FEATURES = "debug-tweaks tools-profile"

IMAGE_INSTALL += " \
    bootchart2 \
    dropbear \
"

CMDLINE += " initcall_debug printk.time=y init=/sbin/bootchartd"
