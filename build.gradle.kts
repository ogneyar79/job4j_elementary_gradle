plugins {
    id("java")
    checkstyle
}

group = "com.maksimus"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.0")

    // AssertJ
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.test {
    useJUnitPlatform()
}

checkstyle {
    toolVersion = "10.3.3"
    configFile = file("checkstyle.xml")
    isIgnoreFailures = false
    isShowViolations = true
}