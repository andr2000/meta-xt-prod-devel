
################################################################################
# Following inc file defines XEN version and needed glue info to get it
# built with the current yocto version
################################################################################
require ../meta-xt-images-domx/recipes-extended/xen/xen-4.14-thud.inc

SRC_URI = "git://github.com/andr2000/xen.git;protocol=https;branch=xen-4.14rc-migration-pci"
