import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.20"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "dev.jonz94"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots") {
        content {
            includeGroup("org.bukkit")
            includeGroup("org.spigotmc")
        }
    }
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly("org.spigotmc", "spigot-api", "1.16.5-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin", "kotlin-stdlib", "1.5.20")
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
