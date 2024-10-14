#HACK this is a temporary workaround to keep the CI working while upstream has quota issues on GitHub
SRC_URI:remove = "git://github.com/starfive-tech/soft_3rdpart.git;protocol=https;lfs=1;nobranch=1;rev=5eca20d2ce6fb7b18044bfe30c5bfd7f8f47958d"
SRC_URI:append = " git://github.com/cordlandwehr/visionfive2_soft_3rdparty_flatmirror.git;protocol=https;nobranch=1;rev=772cec2b15d5550e32df650146a93c9e01c9f983"
