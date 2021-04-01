package com.gjh.learn.kt.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@ConstructorBinding
@ConfigurationProperties("hello")
data class HelloConfig(
    val name: String,
    val age: Int,
    val ext: ExtInfo,
) {
    data class ExtInfo(
        val propA: String,
        val propB: Boolean
    )
}