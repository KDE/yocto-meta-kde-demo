# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL_append = " \
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
    ttf-noto-cjk \
    libreoffice-dictionaries \
    \
    kde-frameworks5 \
    \
    plasma-mobile \
    kde-applications \
    \
    heaptrack \
    kdeconnect-kde \
    \
    koko \
    plasma-camera \
    \
    useradd-kde \
"
