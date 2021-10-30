FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI:append:qemux86-64 += "file://drm.cfg"
