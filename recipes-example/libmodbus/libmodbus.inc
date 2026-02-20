
DESCRIPTION=" basic .bbfile for libmodbus"
LICENSE="GPLv2.1"
LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="git://github.com/stephane/libmodbus.git;protocol=https"


S="${WORKDIR}/git"

do_configure(){
        cd ${S}
        ./autogen.sh
        ./configure --prefix=/usr --host=arm-poky-linux-gnueabi
}

do_compile(){
        make
}

do_install(){
        make install DESTDIR="${D}"
}

DEPENDS += "autoconf-native automake-native libtool-native"
