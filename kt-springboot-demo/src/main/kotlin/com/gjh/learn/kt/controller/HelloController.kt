package com.gjh.learn.kt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * created on 2021/3/30
 *
 * @author kevinlights
 */
@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("/index")
    fun index(): String {
        return "Hello World!"
    }
}