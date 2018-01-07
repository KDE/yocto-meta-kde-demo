#FILESEXTRAPATHS_prepend_qemux86-64 := "${THISDIR}/${BPN}:"
#SRC_URI_append_qemux86-64 = " file://0001-Use-llvm_prefix-variable-directly.patch"
#EXTRA_OECONF_qemux86-64 = "--enable-shared-glapi --with-llvm-prefix=${STAGING_BINDIR_CROSS}"

# The gallium-llvm is recommended as software 3D graphics renderer
#GALLIUM_LLVM = "gallium-llvm"
#PACKAGECONFIG_append_qemux86 = " gallium ${GALLIUM_LLVM}"
#PACKAGECONFIG_append_qemux86-64 = " gallium ${GALLIUM_LLVM}"

#DRIDRIVERS_append_intel-corei7-64 = ",i965"

PACKAGECONFIG_append_qemux86-64 += " gallium gallium-llvm"
GALLIUMDRIVERS_qemux86-64 = "swrast,virgl"
