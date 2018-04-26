FROM opensuse:42.3

RUN zypper --non-interactive install \
    bash-completion \
    vim \
    python \
    python3 \
    gcc \
    gcc-c++ \
    git \
    chrpath \
    make \
    wget \
    python-xml \
    diffstat \
    makeinfo \
    python-curses \
    patch \
    socat \
    tar \
    python3-pip \
    python3-pexpect \
    which \
    glibc-locale \
    python3-xml \
    python3-curses \
    sudo  \
    iproute2 \
    libSDL-devel \
    hostname \
    tmux
RUN useradd -u 1000 -g 100 -m yoctouser

USER yoctouser
ENV LANG=en_US.UTF-8
WORKDIR /k/yocto
CMD /bin/bash
