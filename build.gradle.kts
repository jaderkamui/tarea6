// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2") // O la versión más reciente
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22") // O la versión más reciente
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44") // Asegúrate de tener esta línea
    }
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "jader_munoz_seccion6"
include(":app")

subprojects {
    val buildDirProvider = layout.buildDirectory.dir(project.name) // Esta es la línea importante
    buildDir = buildDirProvider.get().asFile // Esta es la línea importante
    evaluationDependsOn(":app")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}