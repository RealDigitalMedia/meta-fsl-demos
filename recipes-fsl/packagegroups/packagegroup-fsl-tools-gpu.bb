# Copyright (C) 2012-2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Freescale package group - tools/gpu"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

SOC_TOOLS_GPU = ""
SOC_TOOLS_GPU_mx5 = " \
    ${@base_contains('DISTRO_FEATURES', 'x11', 'amd-gpu-x11-bin-mx51', 'amd-gpu-bin-mx51', d)} \
"

SOC_TOOLS_GPU_mx6 = " \
    gpu-viv-bin-mx6q \
    gpu-viv-g2d \
    ${@base_contains('DISTRO_FEATURES', 'x11', 'fsl-gpu-sdk', '', d)} \
"

RDEPENDS_${PN} = " \
    ${SOC_TOOLS_GPU} \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
