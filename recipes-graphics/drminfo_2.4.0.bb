SUMMARY = "Small utility to dump info about DRM devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=32fd56d355bd6a61017655d8da26b67c"
HOMEPAGE = "https://drmdb.emersion.fr/"

inherit meson
inherit pkgconfig

DEPENDS += " \
    json-c \
    libdrm \
    pciutils \
"

SRC_URI = " \
    git://gitlab.freedesktop.org/emersion/drm_info.git;nobranch=1;protocol=https \
    file://0001-Support-cross-compilation-with-sysroot-directory.patch \
"

SRCREV = "4f4d727a9757e7ef6bf25ad7d289066990a1face"
S = "${WORKDIR}/git"
