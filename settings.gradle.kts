/*
 * This file was generated by the Gradle 'init' task.
 */

rootProject.name = "dashj-parent"

include("bls")
include("core")
include("example")
include("tools")
include("wallet-template")

for (project in rootProject.children) {
    project.projectDir = file("${project.name}")
}