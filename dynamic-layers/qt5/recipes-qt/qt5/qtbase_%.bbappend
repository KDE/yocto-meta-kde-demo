PACKAGECONFIG:append:class-target = " \
    gles2 \
    sm \
    openssl \
    fontconfig \
    freetype \
    harfbuzz \
    sql-sqlite \
    zlib \
    jpeg \
    libpng \
    gif \
    dbus \
    udev \
    accessibility \
    cups \
    gbm \
    kms \
    eglfs \
"

PACKAGECONFIG:remove = "tests"

# qemux86_64 fails with gold later on when using a gold-built Qt
QT_CONFIG_FLAGS:append = " \
    -no-use-gold-linker \
"
