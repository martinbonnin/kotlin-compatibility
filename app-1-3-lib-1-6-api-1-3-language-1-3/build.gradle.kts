plugins {
  id("org.jetbrains.kotlin.jvm").version("1.3.72")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
  implementation(project(":lib-1-6-api-1-3-language-1-3"))
}