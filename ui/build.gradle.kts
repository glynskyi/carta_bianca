plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }

    buildFeatures {
        dataBinding = true
    }
}

androidExtensions {
    isExperimental = true
}

dependencies {
    implementation(project(":domain"))
    api("com.google.dagger:dagger-android:2.25.2")
    api("com.google.dagger:dagger-android-support:2.25.2")
    api("com.google.android.material:material:1.0.0")
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.fragment:fragment-ktx:1.1.0")
    api("androidx.lifecycle:lifecycle-viewmodel:2.2.0-rc03")
    api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0-rc03")
    api("androidx.lifecycle:lifecycle-extensions:2.2.0-rc03")
    api("androidx.constraintlayout:constraintlayout:2.0.0-beta3")
    api("com.snakydesign.livedataextensions:lives:1.3.0")
}
