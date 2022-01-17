plugins {
    id("org.jetbrains.kotlinx.kover")
}

allprojects {
    repositories {
        google()
        mavenCentral()
        flatDir { dirs("libs") }
    }
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(libs.pluginAndroidTools)
        classpath(libs.pluginKotlin)
        classpath(libs.pluginKtLint)
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}