SUMMARY = "OpenBMC for Home - Application"

inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \
        ${PN}-system \
        "

PROVIDES += "virtual/obmc-system-mgmt"

RPROVIDES:${PN}-system += "virtual-obmc-system-mgmt"

