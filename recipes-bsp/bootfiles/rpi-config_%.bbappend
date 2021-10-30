do_deploy:append_raspberrypi3-64() {
    echo "dtoverlay=rpi-ft5406" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    #echo "dtoverlay=rpi-ft5406,touchscreen-swapped-x-y=1,touchscreen-inverted-x=1" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    #echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
do_deploy:append_raspberrypi4() {
    # enable multi-screen support
    echo "max_framebuffers=2" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}

# DISPLAY_ROTATE= "1"
# ENABLE_UART = "1"
GPU_MEM_1024_raspberrypi3-64 = "256"
