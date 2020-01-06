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
    api("com.jakewharton.timber:timber:4.7.1")
    api("com.google.dagger:dagger:2.25.2")
    api("androidx.core:core-ktx:1.1.0")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${rootProject.ext["kotlin_version"]}")
    api("org.jetbrains.kotlin:kotlin-reflect:${rootProject.ext["kotlin_version"]}")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.2")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.2")
}
