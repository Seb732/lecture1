plugins {
    java
    eclipse
}

allprojects {
    group = "capgemini"
}

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    java.sourceCompatibility = JavaVersion.VERSION_18
    java.targetCompatibility = JavaVersion.VERSION_18

    dependencies {
        compileOnly("org.projectlombok:lombok:1.18.22")
        annotationProcessor("org.projectlombok:lombok:1.18.22")
        testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

    }
}

