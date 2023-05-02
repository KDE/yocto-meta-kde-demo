EXTRA_IMAGE_FEATURES:append = " debug-tweaks"

IMAGE_INSTALL:append = " \
    dropbear \
    gdb \
    rsync \
    openssh-sftp \
    openssh-sftp-server \
    strace \
"
