# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb
inherit kde-demo-core-debug-tweaks

IMAGE_FEATURES += "splash"

PACKAGES_VULKAN ?= "${@bb.utils.contains('DISTRO_FEATURES', 'vulkan', 'vulkan-tools vulkan-loader vulkan-samples', '', d)}"

IMAGE_INSTALL:append = " \
    sddm \
    packagegroup-plasma-desktop-workspace \
    packagegroup-kde-applications \
    liberation-fonts \
    ttf-noto \
    useradd-kde \
    evtest \
    ${PACKAGES_VULKAN} \
"

# initial set of VisionFive2 tweaks
# this shall be replaced by implicit pulling via SDDM, plank-player and KWin
IMAGE_INSTALL:append:visionfive2 = " \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
    gstreamer1.0-plugins-ugly \
    gstreamer1.0-omx \
    \
    apitrace \
"
