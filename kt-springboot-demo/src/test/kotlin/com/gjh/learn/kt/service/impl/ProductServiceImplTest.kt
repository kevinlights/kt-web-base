package com.gjh.learn.kt.service.impl

import com.gjh.learn.kt.exceptions.TestException
import com.ninjasquad.springmockk.MockkBean
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.justRun
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 *
 * created on 2022/11/15
 *
 * @author kevinlights
 */
@ExtendWith(SpringExtension::class)
internal class ProductServiceImplTest {

    @InjectMockKs
    lateinit var productServiceImpl: ProductServiceImpl

    @Test
    fun getName() {
        productServiceImpl.getName()
    }

    @Test
    fun `throw TestException when type is test1`() {
        assertThrows<TestException>("this is a test exception msg.", {
            productServiceImpl.check("test1")
        })

    }

    @Test
    fun `not throw any exceptions while type is not in list`() {
        productServiceImpl.check("test")
        println(ProductServiceImpl.types)
    }
}