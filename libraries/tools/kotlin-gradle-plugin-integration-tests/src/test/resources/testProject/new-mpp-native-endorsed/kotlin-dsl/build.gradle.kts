plugins {
    id("org.jetbrains.kotlin.multiplatform").version("<pluginMarkerVersion>")
}

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

kotlin {
    sourceSets["commonMain"].apply {
        dependencies {
            api("org.jetbrains.kotlin:kotlin-stdlib-common")
        }
    }

    val macos = macosX64("macos64")
    val linux = linuxX64("linux64")
    val windows = mingwX64("mingw64")

    configure(listOf(macos, linux, windows)) {
        compilations.all {
            kotlinOptions.verbose = true
            enableEndorsedLibs = true
        }
        binaries {
            executable()
        }
    }
}
