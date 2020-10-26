
plugins {
    id("org.dashj.java-conventions")
    kotlin("jvm") version "1.3.72"
}

repositories {
    mavenCentral()
}
dependencies {
    compile(files("./bls/build/libdashjbls.dylib")) // TODO
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.guava:guava:30.0-jre")
    testImplementation("junit:junit:4.12")
}

description = "dashj-bls"

//java {
//    withJavadocJar()
//}