DESCRIPTION="basic .bb file for autoconf"
LICENSE="CLOSED"
SRC_URI="file://main.c \
	 file://Makefile.am \
	 file://configure.ac"

S="${WORKDIR}"

do_compile(){
	cd ${S}
	autoreconf --install
	./configure --host =arm-poky-linux-gnueabi
	make
}

do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/hello ${D}/usr/bin
}
