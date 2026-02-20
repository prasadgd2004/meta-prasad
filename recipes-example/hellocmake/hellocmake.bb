DESCRIPTION="basic .bb file for cmake"
LICENSE="CLOSED"
SRC_URI="file://hellocmake.c\
	 file://CMakeLists.txt "
S="${WORKDIR}"
do_compile(){
	cd ${S}
	mkdir -p build
	cd build
	cmake ..
	make
}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/build/hellocmake ${D}/usr/bin
}
