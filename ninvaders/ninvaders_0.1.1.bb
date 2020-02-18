SUMMARY = "Fun game based on ncurses"
HOMEPAGE = "osef"
SECTION = "games"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://README;beginline=40;endline=44;md5=0871c94fa9c999a9b071b120ad503b24"

DEPENDS = "ncurses"
RDEPENDS_${PN} = "ncurses"

SRC_URI = "file://ninvaders-${PV}.tar.gz \
           file://0001-Fix-CC-issue-with-yocto.patch \
           "

do_install () {
	install -m 0755 -d ${D}${bindir}
	install -m 0644 ${S}/nInvaders ${D}${bindir}
}
