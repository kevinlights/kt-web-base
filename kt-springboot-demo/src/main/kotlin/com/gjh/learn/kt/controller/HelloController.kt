package com.gjh.learn.kt.controller

import com.gjh.learn.kt.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
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
class HelloController(
    @Autowired val helloService: HelloService
) {

    @GetMapping("/index")
    fun index(req: HttpServletRequest): String {
        return helloService.sayHello("Guang")
    }
}