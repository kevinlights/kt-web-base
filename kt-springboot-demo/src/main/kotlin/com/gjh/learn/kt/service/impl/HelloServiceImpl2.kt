package com.gjh.learn.kt.service.impl

import com.gjh.learn.kt.service.HelloService

/**
 *
 * created on 2022/11/14
 *
 * @author kevinlights
 */
class HelloServiceImpl2 : HelloService {
    override fun sayHello(name: String): String {
        TODO("Not yet implemented")
    }

    override fun noNeedOverride(): String {
        return super.noNeedOverride()
    }
}