plugins { alias(libs.plugins.kotlin.multiplatform) apply false }
subprojects {
    group = "com.netonstream"
    version = providers.gradleProperty("adapterVersion").get()
}
