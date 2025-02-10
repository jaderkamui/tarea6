import androidx.compose.ui.layout.layout
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

rootProject.layout.buildDirectory.set(file("../build"))
subprojects {
    layout.buildDirectory.set(file("${rootProject.layout.buildDirectory.get()}/${project.name}"))
    evaluationDependsOn(":app")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}