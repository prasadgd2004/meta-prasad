DESCRIPTION="basic .bb file for aws"

LICENSE="Apache-2.0"

LIC_FILES_CHKSUM="file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI="git://github.com/awslabs/aws-c-common.git;protocol=https;branch=main"

SRCREV="95515a8b1ff40d5bb14f965ca4cbbe99ad1843df"

S="${WORKDIR}/git"

inherit cmake


