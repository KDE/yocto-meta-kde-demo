SUMMARY = "Plasma Mobile User Setup"
PR = "r1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

inherit useradd

ALLOW_EMPTY_${PN} = "1"
USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "-d /home/kde -P kde -g user kde"
GROUPADD_PARAM_${PN} = "user; systemd-journal"
