plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }
}

androidExtensions {
    isExperimental = true
}

dependencies {
    implementation(project(":domain"))
}
