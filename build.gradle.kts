import java.io.File

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2") // O la versión más reciente
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22") // O la versión más reciente
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44") // Asegúrate de tener esta línea
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val rootProjectBuildDir = project.buildDir

subprojects {
    buildDir = File(rootProjectBuildDir, project.name)
    evaluationDependsOn(":app")
}

tasks.register("clean", Delete::class) {
    delete(rootProjectBuildDir)
}