PACKAGECONFIG:append = " \
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
"
PACKAGECONFIG:remove = "tests"

# qemux86_64 fails with gold later on when using a gold-built Qt
QT_CONFIG_FLAGS:append = " \
    -no-use-gold-linker \
"
