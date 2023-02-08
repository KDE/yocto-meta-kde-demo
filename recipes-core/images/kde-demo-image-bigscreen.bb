# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb
inherit kde-demo-core-debug-tweaks

IMAGE_INSTALL:append = " \
    kernel-modules \
    wpa-supplicant \
    \
    sddm \
    sddm-config-plasma-bigscreen \
    packagegroup-plasma-bigscreen-workspace \
    packagegroup-core-x11-utils \
    liberation-fonts \
    ttf-noto \
    \
    useradd-kde \
    \
    gcompris \
    kdeconnect-kde \
    \
    evtest \
    ldd \
"

IMAGE_INSTALL:append:raspberrypi4 = " \
    linux-firmware \
    rpi-gpio \
"

# initial set of VisionFive2 tweaks
# this shall be replaced by implicit pulling via SDDM, plank-player and KWin
IMAGE_INSTALL:append:visionfive2 = " \
    xserver-xorg-extension-glx \
    xf86-video-modesetting \
    \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    sf-gst-omx \
"
