package com.gjh.learn.kt.service.impl

import com.gjh.learn.kt.service.HelloService
import com.ninjasquad.springmockk.MockkBean
import io.mockk.junit5.MockKExtension
import io.mockk.justRun
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

/**
 *
 * created on 2022/10/30
 *
 * @author kevinlights
 */
@ExtendWith(MockKExtension::class)
internal class HelloServiceImplTest() {

    @MockkBean
    private lateinit var helloService: HelloServiceImpl

    @Test
    fun `fortest`() {
        val arr = arrayListOf("a", "b", "c")
        for (item in arr) {
            println(item)
        }
    }

    @Test
    fun `throw Exception for name 1`() {
        Assertions.assertThrows(Exception::class.java, {
            helloService.validate("1")
        })

    }

    @Test
    fun testSayHello() {
        justRun {

            println(helloService.sayHello("abc"))
        }
    }

    @Test
    fun `testthrows`() {
        Assertions.assertEquals(100, Assertions.assertThrows(MyException::class.java, {
            throwError()
        }).code)
        Assertions.assertThrows(MyException::class.java) {

        }
    }

    fun throwError() {
        throw MyException("this is a test exception")
    }
}

class MyException(var msg: String) : Exception() {
    var code: Int = 100
}

enum class Demo(var id: Int) {
    DEMOA(1),
    DEMOB(2),
}

//fun main() {
//    println(Demo.valueOf(Demo.DEMOA.name))
//}

