package com.gjh.learn.kt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

/**
 *
 * created on 2021/3/30
 *
 * @author kevinlights
 */
@SpringBootApplication
@ConfigurationPropertiesScan
class WebApp

fun main(args: Array<String>) {
    runApplication<WebApp>(*args)
}