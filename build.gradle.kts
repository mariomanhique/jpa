plugins {
    java
    id("org.springframework.boot") version "3.2.2"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "com.mariomanhique"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly("com.mysql:mysql-connector-j")
    compileOnly ("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
//
   implementation("com.github.javafaker:javafaker:1.0.2") {
        exclude(module = "snakeyaml")
    }

    implementation("org.yaml:snakeyaml:2.2")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
