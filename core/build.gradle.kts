import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.dashj.java-conventions")
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(project(":bls"))
    implementation("de.sfuhrm:saphir-hash-core:3.0.5")
    implementation("com.h2database:h2:1.3.167")
    implementation("org.bouncycastle:bcprov-jdk15to18:1.63")
    implementation("com.google.protobuf:protobuf-javalite:3.11.4")
    implementation("com.google.code.findbugs:jsr305:2.0.1")
    implementation("net.jcip:jcip-annotations:1.0")
    implementation("com.lambdaworks:scrypt:1.4.0")
    implementation("postgresql:postgresql:9.1-901.jdbc4")
    implementation("mysql:mysql-connector-java:5.1.33")
    implementation("org.fusesource.leveldbjni:leveldbjni-all:1.8")
    implementation("com.squareup.okhttp3:okhttp:3.12.3")
    implementation("org.json:json:20180130")
    testImplementation("junit:junit:4.12")
    testImplementation("org.easymock:easymock:3.2")
    testImplementation("com.fasterxml.jackson.core:jackson-databind:2.9.10.5")
    api("com.google.guava:guava:30.0-jre")
}

description = "dashj"

//java {
//    withJavadocJar()
//}