do_deploy_append() {
    echo "dtoverlay=rpi-ft5406,touchscreen-swapped-x-y=1,touchscreen-inverted-x=1" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
    echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

DISPLAY_ROTATE= "1"
ENABLE_UART_raspberrypi3-64 = "1"
GPU_MEM_1024 = "256"
