package com.gjh.learn.kt.service.impl

import com.gjh.learn.kt.config.HelloConfig
import com.gjh.learn.kt.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@Service
class HelloServiceImpl(@Autowired val helloConfig: HelloConfig) : HelloService {
    override fun sayHello(name: String): String {
        return "Hello ${helloConfig.name}, ${helloConfig.ext.propA}, ${helloConfig.ext.propB}"
    }
}