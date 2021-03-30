
rootProject.name = "learn-kotlin"
include(":hello-world")
include(":kt-springboot-demo")

pluginManagement {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin/")
        }
    }
}