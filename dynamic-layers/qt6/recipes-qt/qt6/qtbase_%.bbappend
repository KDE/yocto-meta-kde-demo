PACKAGECONFIG:append:class-target = " \
    openssl \
    fontconfig \
    harfbuzz \
    sql-sqlite \
    zlib \
    jpeg \
    dbus \
    udev \
    accessibility \
    xcb \
    cups \
"

PACKAGECONFIG_GRAPHICS:class-target = " \
    ${@bb.utils.filter('DISTRO_FEATURES', 'vulkan', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)} \
    gbm \
    kms \
    gles2 \
    eglfs \
"
