plugins {
  id("org.jetbrains.kotlin.jvm").version("1.6.10")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
  implementation(project(":lib-1-3"))
}