import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    application
}
repositories {
    mavenLocal()
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
    maven {
        setUrl("https://maven.aliyun.com/repository/spring/")
    }
    mavenCentral()
}

dependencies {

}

application {
    mainClassName = "MainKt"
}