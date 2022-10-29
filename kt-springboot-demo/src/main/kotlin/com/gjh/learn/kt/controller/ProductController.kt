package com.gjh.learn.kt.controller

import com.gjh.learn.kt.config.NotControllerResponseAdvice
import com.gjh.learn.kt.data.ProductInfoVO
import com.gjh.learn.kt.data.ProductVO
import com.gjh.learn.kt.service.ProductService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
@RestController
@RequestMapping("/product")
class ProductController(
    val productService: ProductService,
) {

    @GetMapping("/findById")
    fun findProductById(id: Int): ProductVO {
        return ProductVO(id, "productA")
    }

    @PostMapping("/findByVO")
    fun findProductByVO(@Valid @RequestBody vo: ProductInfoVO): ProductInfoVO {
        return vo
    }

    @GetMapping("/health")
    @NotControllerResponseAdvice
    fun health(): String {
        return "success"
    }

    @GetMapping("/exception")
    fun exception() {
        throw APIException(AppCode.APP_ERROR, "Test App Error")
    }

}