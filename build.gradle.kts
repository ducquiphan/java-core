plugins {
    `java-library`
}

group = "com.java"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

// This sets the project's encoding to UTF-8, just like in your pom.xml
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

// Your pom.xml didn't have any dependencies, but if you need to add some,
// you can do it like this:
// dependencies {
//     // Example for JUnit 5:
//     testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
// }