/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.dashj.java-conventions")
}

dependencies {
    implementation(project(":dashj-core"))
    implementation("net.sf.jopt-simple:jopt-simple:5.0.4")
    implementation("com.h2database:h2:1.3.167")
    implementation("org.fusesource.leveldbjni:leveldbjni-all:1.8")
}

description = "dashj Examples"
