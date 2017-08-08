# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# Include modules in rootfs // kernel-modules is from rpi-hwup-image - needed?
IMAGE_INSTALL_append = " \
    qtbase-plugins \
    qtdeclarative-qmlplugins \
    qtwayland \
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
    kidletime \
    kimageformats \
    kitemmodels \
    kitemviews \
    kplotting \
    ksyntaxhighlighting \
    kwayland \
    kwidgetsaddons \
    kwindowsystem \
    modemmanager-qt \
    networkmanager-qt \
    oxygen-icons \
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
    kactivitiesstats \
    kbookmarks \
    kcmutils \
    kdeclarative \
    kded \
    kdesu \
    kemoticons \
    kglobalaccel \
    kiconthemes \
    kio \
    knewstuff \
    knotifyconfig \
    kparts \
    kpeople \
    krunner \
    kservice \
    ktextwidgets \
    kwallet \
    kxmlgui \
    kxmlrpcclient \
    plasma-framework \
    \
    kirigami \
"
