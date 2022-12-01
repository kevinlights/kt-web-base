package com.gjh.learn.kt.service.impl

import com.gjh.learn.kt.exceptions.TestException
import com.gjh.learn.kt.service.ProductService
import org.springframework.stereotype.Service

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
@Service
class ProductServiceImpl : ProductService {
    companion object {
        var types = arrayOf("test1", "test2")
    }
    override fun getName(): String {
        println("run getName")
        return "test"
    }

    override fun check(type: String) {
        if (types.contains(type)) {
            println("$type is in the list of types")
            throw TestException("this is a test exception msg.")
        }
//        throw TestException("this is a test exception msg.")
    }
}