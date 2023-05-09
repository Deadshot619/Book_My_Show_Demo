object Versions {
    const val core = "1.10.0"
    const val lifecycle = "2.6.1"
    const val appCompat = "1.6.1"
    const val material = "1.9.0"
    const val constraintLayout = "2.1.4"

    const val junit = "4.13.2"
    const val androidTestJUnit = "1.1.5"
    const val androidTestEspresso = "3.5.1"
}

object ConfigData {
    const val compileSdkVersion = 33
    const val minSdkVersion = 24
    const val targetSdkVersion = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val jvmTarget = "1.8"
}

object Deps {
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidTestJUnit = "androidx.test.ext:junit:${Versions.androidTestJUnit}"
    const val androidTestEspresso = "androidx.test.espresso:espresso-core:${Versions.androidTestEspresso}"
}