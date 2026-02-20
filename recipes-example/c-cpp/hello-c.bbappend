
FILESEXTRAPATHS:prepend:="${THISDIR}/files/:"

SRC_URI:append=" file://hellocpp.cpp"

do_compile:append(){

	${CXX} ${LDFLAGS} hellocpp.cpp -o hellocpp
}

do_install:append(){
	
	install -m 777 ${S}/hellocpp ${D}/usr/bin
}

packages +="hello-c hello-cpp"


FILES_hello-c="usr/bin/hello"
FILES_hello-cpp="usr/bin/hellocpp" 
