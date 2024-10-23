SUMMARY = "Plasma Mobile User Setup"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += " \
    openssl-native \
"

inherit useradd

ALLOW_EMPTY:${PN} = "1"
USERADD_PACKAGES = "${PN}"
# salt value 42 chosen arbitrarily
USERADD_PARAM:${PN} = "-d /home/kde -p $(openssl passwd -salt 42 kde) -g user kde"
GROUPADD_PARAM:${PN} = "user; systemd-journal"

# disable password expire user feature: this would break sddm integration because SDDM can only handle this in the unreleased 1.0 version
perform_passwd_expire() {
}
