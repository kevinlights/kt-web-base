package com.gjh.learn.kt.config

import com.gjh.learn.kt.controller.APIException
import com.gjh.learn.kt.controller.ResultCode
import com.gjh.learn.kt.controller.ResultVO
import org.springframework.validation.BindException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
@RestControllerAdvice
class ControllerExceptionAdvice {
    @ExceptionHandler(value = arrayOf(BindException::class))
    fun MethodArgumentNotValidExceptionHandler(e: BindException): ResultVO {
        return ResultVO(ResultCode.VALIDATE_ERROR, e.bindingResult.allErrors.get(0).defaultMessage)
    }

    @ExceptionHandler(value = arrayOf(APIException::class))
    fun APIExceptionHandler(e: APIException): ResultVO {
        return ResultVO(e.code, e.msg, e.message)
    }
}