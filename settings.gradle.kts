pluginManagement {
    plugins {
        kotlin("jvm") version "2.0.21"
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "IridiumCore"
include("plugin")
include("multiversion")
include("multiversion:common")
include("multiversion:default")
include("multiversion:V1_21_R1")
include("multiversion:v1_20_R4")
include("multiversion:v1_20_R3")
include("multiversion:v1_20_R2")
include("multiversion:v1_20_R1")
include("multiversion:v1_19_R3")
include("multiversion:v1_19_R2")
include("multiversion:v1_19_R1")
include("multiversion:v1_18_R2")
include("multiversion:v1_18_R1")
include("multiversion:v1_17_R1")
include("multiversion:v1_16_R3")
include("multiversion:v1_16_R2")
include("multiversion:v1_16_R1")
include("multiversion:v1_15_R1")
include("multiversion:v1_14_R1")
include("multiversion:v1_13_R2")
include("multiversion:v1_13_R1")
include("multiversion:v1_12_R1")
include("multiversion:v1_11_R1")
include("multiversion:v1_10_R1")
include("multiversion:v1_9_R2")
include("multiversion:v1_9_R1")
include("multiversion:v1_8_R3")
include("multiversion:v1_8_R2")

