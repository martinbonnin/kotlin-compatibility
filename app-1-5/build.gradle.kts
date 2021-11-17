plugins {
  id("org.jetbrains.kotlin.jvm").version("1.5.21")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
  implementation(project(":lib-1-6"))
}