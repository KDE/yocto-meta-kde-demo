do_deploy:append:raspberrypi3-64() {
    echo "dtoverlay=rpi-ft5406" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    #echo "dtoverlay=rpi-ft5406,touchscreen-swapped-x-y=1,touchscreen-inverted-x=1" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    #echo "dtoverlay=pi3-disable-bt" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}
do_deploy:append:raspberrypi4() {
    # enable multi-screen support
    echo "max_framebuffers=2" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}

GPU_MEM_1024:raspberrypi3-64 = "256"

# enforce KMS driver for following touchscreen configuration
VC4DTBO = "vc4-kms-v3d"
do_deploy:append:raspberrypi4() {
    # enable official 7-inch touchscreen in combination with KMS driver
    echo "ignore_lcd=1" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
    echo "dtoverlay=vc4-kms-dsi-7inch" >> ${DEPLOYDIR}/${BOOTFILES_DIR_NAME}/config.txt
}

# uncomment to enable
# DISPLAY_ROTATE= "1"
# ENABLE_UART = "1"
