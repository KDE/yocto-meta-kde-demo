# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL:append = " \
    dropbear \
    gdb \
    strace \
    kernel-modules \
    sddm \
    sddm-config-plasma-mobile \
    \
    qtbase-plugins \
    qttools-tools \
    qtdeclarative-tools \
    qtsvg-plugins \
    liberation-fonts \
    ttf-noto \
    libreoffice-dictionaries \
    \
    packagegroup-plasma-mobile-workspace \
    \
    heaptrack \
    \
    packagegroup-kde-applications \
    \
    useradd-kde \
"
#    plasma-camera

IMAGE_INSTALL:append:raspberrypi4 = " \
    linux-firmware \
    rpi-gpio \
"
