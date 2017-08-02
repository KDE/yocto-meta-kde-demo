# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL_append = " \
    qtbase-plugins \
    qtdeclarative-qmlplugins \
    \
    attica \
    bluez-qt \
    breeze-icons \
    karchive \
    kcodecs \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    kdnssd \
    kguiaddons \
    ki18n \
    kimageformats \
    kitemmodels \
    kitemviews \
    kplotting \
    kwayland \
    kwidgetsaddons \
    kwindowsystem \
    modemmanager-qt \
    networkmanager-qt \
    prison \
    solid \
    sonnet \
    threadweaver \
    \
    kactivities \
    kauth \
    kcrash \
    kfilemetadata \
    kjobwidgets \
    knotifications \
    kpackage \
    kpty \
    kunitconversion \
    \
    kbookmarks \
    kdeclarative \
    kglobalaccel \
    kiconthemes \
    kio \
    kservice \
    ktextwidgets \
    kxmlgui \
    \
    kirigami \
"
