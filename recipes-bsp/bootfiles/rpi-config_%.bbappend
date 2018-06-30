do_deploy_append() {
    echo "dtoverlay=rpi-ft5406" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

ENABLE_UART_raspberrypi3-64 = "1"
GPU_MEM_1024 = "256"
