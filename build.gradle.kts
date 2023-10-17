plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "de.asula"
version = "1.0-SNAPSHOT"

repositories {
    maven(uri("https://repo.papermc.io/repository/maven-public/"))
    mavenCentral()
}

dependencies {
    // lombok
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    // velocity api
    compileOnly("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")
    annotationProcessor("com.velocitypowered:velocity-api:3.2.0-SNAPSHOT")

    // jetbrains annotations
    implementation("org.jetbrains:annotations:24.0.1")
}