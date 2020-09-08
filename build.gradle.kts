buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }
    dependencies {
        classpath(GradlePlugins.kotlin)
        classpath(GradlePlugins.androidBuildTools)
    }
}

allprojects {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
    }
}