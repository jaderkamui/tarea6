pluginManagement {
    repositories {
        google() // Repositorio Google para plugins
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Fuerza a usar solo los repositorios de settings
    repositories {
        google() // Repositorio Google para dependencias
        mavenCentral()
    }
}

rootProject.name = "jader_munoz_seccion6"
include(":app")