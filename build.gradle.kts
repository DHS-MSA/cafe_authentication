import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.0.1"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.8.0"
    kotlin("plugin.spring") version "1.8.0"
    kotlin("plugin.allopen") version "1.8.0"
    kotlin("plugin.noarg") version "1.8.0"
    kotlin("plugin.jpa") version "1.8.0"
    kotlin("kapt") version "1.3.61"
}

group = "com.dhs"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17
val querydslVersion = "5.0.0"

repositories {
    mavenCentral()
}

kotlin.sourceSets.main{
    setBuildDir("$buildDir")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    //db
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("org.mariadb.jdbc:mariadb-java-client")

    //kafka
    implementation("org.springframework.kafka:spring-kafka")

    //querydsl
    implementation("com.querydsl:querydsl-jpa:$querydslVersion:jakarta")
    implementation("com.querydsl:querydsl-core:$querydslVersion")
    kapt("com.querydsl:querydsl-apt:$querydslVersion:jakarta")
    kapt("com.querydsl:querydsl-kotlin-codegen:$querydslVersion")
    kapt("org.springframework.boot:spring-boot-configuration-processor")

    //test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}

noArg{
    invokeInitializers = true
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.getByName<Jar>("jar"){
    enabled = false
}