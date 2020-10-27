import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.dashj.java-conventions")
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":bls"))
    implementation(project(":core"))
//    implementation(kotlin("gradle-plugin:1.4.10"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
    compile("com.google.protobuf:protobuf-java:3.6.1")
    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")
    implementation("org.fusesource.leveldbjni:leveldbjni-all:1.8")
    implementation("org.bouncycastle:bcprov-jdk16:1.45")
}

description = "dashj Examples"