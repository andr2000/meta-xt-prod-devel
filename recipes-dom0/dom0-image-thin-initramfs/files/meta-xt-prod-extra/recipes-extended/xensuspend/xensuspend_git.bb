SUMMARY = "Xen suspend coordinator"
HOMEPAGE = "https://github.com/lorc/xensuspend"
LICENSE = "GPLv2"

SRCREV = "master"
SRC_URI = "git://github.com/lorc/xensuspend.git;protocol=https"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} = "\
	       pyxs \
	       xen-xl \
	       xen-xenstat \
	       xen-xenstore \
	       python3-argparse \
	       python3-ctypes \
	       python3-shell \
	       python3-lockfile\
	       python3-daemon \
	       "
