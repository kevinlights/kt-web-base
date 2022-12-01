package com.gjh.learn.kt.service

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
interface HelloService {
    fun sayHello(name: String): String

    fun noNeedOverride(): String {
        return ""
    }

    fun validate(name: String) {}


}