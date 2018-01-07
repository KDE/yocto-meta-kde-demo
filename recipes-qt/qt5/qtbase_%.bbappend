# no-qml-debug breaks kdeclarative, which in turn is caused by qt cmake config files not containing the necessary defines...
PACKAGECONFIG_append = " \
    gles2 \
    sm \
    qml-debug \
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
    icu \
    udev \
"

# qemux86_64 fails with gold later on when using a gold-built Qt
QT_CONFIG_FLAGS_append = " \
    -no-use-gold-linker \
"
