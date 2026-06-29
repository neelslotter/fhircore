pluginManagement {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven(url = "https://plugins.gradle.org/m2/")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        maven(url = "https://central.sonatype.com/repository/maven-snapshots")
    }
}
dependencyResolutionManagement {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        maven(url = "https://central.sonatype.com/repository/maven-snapshots")
        maven(url = "https://jcenter.bintray.com/")
        maven {
            url = uri("https://maven.pkg.github.com/opensrp/fhircore")
            credentials {
                username = providers.gradleProperty("gpr.user").orNull ?: System.getenv("GITHUB_ACTOR")
                password = providers.gradleProperty("gpr.key").orNull ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
rootProject.name = "fhircore-android"
include (":engine")
include (":quest")
include (":geowidget")
include(":linting")
include(":macrobenchmark")
