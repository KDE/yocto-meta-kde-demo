include recipes-core/images/core-image-minimal.bb

SUMMARY = "image with basic test tools for initial device tests"

IMAGE_INSTALL:append = " \
    dropbear \
    gdb \
    strace \
    htop \
    \
    kernel-modules \
    linux-firmware \
    \
    drminfo \
    pciutils \
    \
    qtbase-plugins \
    qttools-tools \
    qtsvg-plugins \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtsvg-qmlplugins \
    qtwayland-plugins \
    qtwayland-qmlplugins \
"
