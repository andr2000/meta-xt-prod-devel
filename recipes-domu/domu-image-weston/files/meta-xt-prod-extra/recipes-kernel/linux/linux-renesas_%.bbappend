FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require inc/xt_shared_env.inc

RENESAS_BSP_URL = "git://github.com/xen-troops/linux.git"

BRANCH = "v4.14.75-ltsi/rcar-3.9.6-xt0.1"
SRCREV = "${AUTOREV}"
LINUX_VERSION = "4.14.75"
SRC_URI_append = " \
    file://defconfig \
    file://r8169.cfg \
"

# Do not autoload r8169 driver
KERNEL_MODULE_PROBECONF += "r8169"
module_conf_r8169 = "blacklist r8169"

DEPLOYDIR="${XT_DIR_ABS_SHARED_BOOT_DOMU}"

do_deploy_append() {
    find ${D}/boot -iname "vmlinux*" -exec tar -cJvf ${STAGING_KERNEL_BUILDDIR}/vmlinux.tar.xz {} \;
}

