package com.gjh.learn.kt.controller

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class HelloControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun index() {
        val res = restTemplate.getForEntity<String>("/hello/index")
        println(res)
        assertNotNull(res)
    }
}