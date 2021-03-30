package com.gjh.learn.kt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

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
    fun index(req: HttpServletRequest): String {
        return "Hello World! from ${req.requestURI}"
    }
}