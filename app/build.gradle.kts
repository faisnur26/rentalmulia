plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.rentalmobilmulia"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.rentalmobilmulia"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.activity)
    implementation(libs.swiperefreshlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    implementation ("com.squareup.retrofit2:retrofit:2.1.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.1.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")


    implementation ("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.12.0")
    implementation ("com.google.code.gson:gson:2.8.8")

    implementation ("com.google.android.material:material:1.11.0")

    implementation ("com.android.volley:volley:1.2.1")

    implementation ("androidx.cardview:cardview:1.0.0")


    implementation ("com.github.denzcoskun:ImageSlideshow:0.1.0")

    implementation ("com.google.android.material:material:1.6.0")

    implementation ("id.zelory:compressor:2.1.1")

    implementation ("com.midtrans:uikit:2.0.0")

    implementation ("com.google.android.gms:play-services-maps:18.2.0")

    implementation ("com.google.android.material:material:1.9.0")


}