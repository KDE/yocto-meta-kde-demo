include recipes-core/images/kde-demo-image.bb

IMAGE_INSTALL += " bootchart2 dropbear"

CMDLINE += " initcall_debug printk.time=y init=/sbin/bootchartd"
