
plugins {
    id("org.dashj.java-conventions")
}

repositories {
    mavenCentral()
}
dependencies {
    compile(files("./bls/build/libdashjbls.dylib")) // TODO
    implementation("com.google.guava:guava:30.0-jre")
    testImplementation("junit:junit:4.12")
}

description = "dashj-bls"

//java {
//    withJavadocJar()
//}