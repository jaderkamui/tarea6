import java.io.File
import org.gradle.api.file.Directory

plugins {
    id("com.android.application") version "8.2.2" apply false // o la version que corresponda
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false // o la version que corresponda
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2") // O la versión más reciente
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22") // O la versión más reciente
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44") // Asegúrate de tener esta línea
    }
}


subprojects {
    val buildDirProvider = layout.buildDirectory.dir(project.name)
    buildDirProvider.get().asFile.mkdirs()
    buildDir = buildDirProvider.get().asFile
    evaluationDependsOn(":app")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}