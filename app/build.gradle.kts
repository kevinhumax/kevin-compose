plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
    alias(libs.plugins.hilt.android)
}

android {
    namespace = "com.kevin.compose"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.kevin.compose"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += listOf("META-INF/INDEX.LIST", "META-INF/io.netty.versions.properties")
        }
    }
}

dependencies {
    // Compose
    implementation(libs.core.ktx)
    implementation(platform(libs.kotlin.bom))
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.navigation.compose)
    implementation(libs.compose.runtime)
    implementation(libs.compose.compiler)
    implementation(libs.constraintlayout.compose)
    implementation(libs.ui.util)
    implementation(libs.compose.material)
    implementation(libs.compose.material3)
    implementation(libs.gson)
    implementation(libs.runtime.livedata)
    implementation(libs.appcompat)
    implementation(libs.core.splashscreen)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.test.manifest)

    // ViewModel
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.savedstate)
    implementation(libs.lifecycle.runtime.compose)

    // Data Store
    implementation(libs.datastore)
    implementation(libs.datastore.preferences)
    implementation(libs.datastore.core)

    // Hilt Compose
    implementation(libs.hilt.navigation.compose)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // Coroutines
    implementation(libs.coroutines.android)
    implementation(libs.coroutines.core)

    // Baseline prof
    implementation(libs.profileinstaller)

    // Tooling preview
    implementation(libs.ui.tooling.preview)
    debugImplementation(libs.ui.tooling)
    implementation(libs.ui.tooling)
}