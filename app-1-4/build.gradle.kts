plugins {
  id("org.jetbrains.kotlin.jvm").version("1.4.32")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.32")
  implementation(project(":lib-1-6"))
}