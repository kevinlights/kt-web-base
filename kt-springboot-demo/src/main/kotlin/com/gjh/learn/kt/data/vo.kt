package com.gjh.learn.kt.data

import java.math.BigDecimal
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
class ProductVO(
    var productId: Int? = null,
    var productName: String? = "",
    var productPrice: BigDecimal = BigDecimal(0),
    var productDescription: String? = "",
    var productStatus: Int = 0,
)

class ProductInfoVO(
    @field:NotBlank(message = "Non Null Product Name")
    @field:NotNull(message = "Non Null Product Name")
    var productName: String?,

    @field:Min(value = 0, message = "Minimum value is 0")
    var productPrice: BigDecimal?,

    var productStatus: Int = 0,
)