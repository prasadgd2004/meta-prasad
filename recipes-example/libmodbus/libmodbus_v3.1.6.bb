DESRIPTION="basic .bb file for libmodbus"

LICENSE="GPLV.2.1"
LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI="https://github.com/stephane/libmodbus/archive/refs/tags/v3.1.6.tar.gz"
SRC_URI[md5sum]="3f94126f7eda99e30d58cdcbf1671dfb"
SRC_URI[sha256]="fe0c141cd10d58bb848643f00f2d4b4005214f93312d7b66ac805fd369876651"

S="${WORKDIR}/libmodbus-3.1.6"

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

