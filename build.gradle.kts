plugins {
    alias(libs.plugins.app.common.library)
    alias(libs.plugins.vanniktech.maven.publisher)
}

android {
    namespace = "com.android.base.architecture.activity"
}

dependencies {
    // 基础库
    api(libs.ztiany.archdelegate)
    // androidx
    api(libs.androidx.appcompat)
    api(libs.androidx.activity.ktx)
    api(libs.androidx.lifecycle.runtime.ktx)
    // kotlin
    api(libs.kotlin.stdlib)
    api(libs.kotlin.reflect)
    // log
    implementation(libs.jakewharton.timber)
}