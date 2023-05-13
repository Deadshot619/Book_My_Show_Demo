import org.gradle.api.JavaVersion

object Versions {
    const val core = "1.10.0"
    const val lifecycle = "2.6.1"
    const val appCompat = "1.6.1"
    const val material = "1.9.0"
    const val constraintLayout = "2.1.4"
    const val hilt = "2.44"

    const val junit = "4.13.2"
    const val androidTestJUnit = "1.1.5"
    const val androidTestEspresso = "3.5.1"

    const val retrofit = "2.9.0"
    const val gsonConvertor = "2.9.0"
    const val okHttp = "4.9.0"

    const val coroutines = "1.6.1"

    const val glide = "4.12.0"
}

object ConfigData {
    const val compileSdkVersion = 33
    const val minSdkVersion = 24
    const val targetSdkVersion = 33
    const val versionCode = 1
    const val versionName = "1.0"
    const val jvmTarget = "17"
    val sourceCompatibilityVersion = JavaVersion.VERSION_17
    val targetCompatibilityVersion = JavaVersion.VERSION_17
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

object Hilt {
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.gsonConvertor}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
}

object Coroutines {
    const val coroutineCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutineAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
}

object Glide {
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val annotationProcessor = "com.github.bumptech.glide:compiler:${Versions.glide}"
}