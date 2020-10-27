//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
//
plugins {
//    // Support convention plugins written in Kotlin. Convention plugins are build scripts in 'src/main' that automatically become available as plugins in the main build.
//    java
//    idea
    kotlin("jvm") version "1.3.72"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies{
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
}

//
//
//val compileKotlin: KotlinCompile by tasks
//compileKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}
//val compileTestKotlin: KotlinCompile by tasks
//compileTestKotlin.kotlinOptions {
//    jvmTarget = "1.8"
//}