# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL:append = " \
    dropbear \
    gdb \
    strace \
    kernel-modules \
    linux-firmware \
    sddm \
    \
    qtbase-plugins \
    qttools-tools \
    qtsvg-plugins \
    liberation-fonts \
    ttf-noto \
    libreoffice-dictionaries \
    \
    packagegroup-kde-frameworks5 \
    \
    packagegroup-plasma-mobile \
    packagegroup-kde-applications \
    \
    heaptrack \
    kdeconnect-kde \
    \
    plasma-camera \
    \
    useradd-kde \
"

IMAGE_INSTALL:append:raspberrypi4 = " \
    rpi-gpio \
"
