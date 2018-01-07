# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL_append = " \
    dropbear \
    gdb \
    strace \
    \
    qtbase-plugins \
    qtdeclarative-qmlplugins \
    qttools-tools \
    liberation-fonts \
    \
    kde-frameworks5 \
    \
    plasma-mobile \
    \
    heaptrack \
"
