SUMMARY = "Pure Python XenStore client implementation, which covers all of the libxs features and adds some nice Pythonic sugar on top"
HOMEPAGE = "https://github.com/selectel/pyxs"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://github.com/selectel/pyxs/archive/${PV}.tar.gz"
SRC_URI[sha256sum] = "9eb0e793f7696284a6c4a134e230cd594b790cb45ae97680e4aa995ccaaffecb"

inherit setuptools3
