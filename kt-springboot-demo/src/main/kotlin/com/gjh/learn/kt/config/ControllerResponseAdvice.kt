package com.gjh.learn.kt.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.gjh.learn.kt.controller.ResultVO
import org.springframework.core.MethodParameter
import org.springframework.http.MediaType
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
@RestControllerAdvice(basePackages = arrayOf("com.gjh.learn.kt.controller"))
class ControllerResponseAdvice : ResponseBodyAdvice<Any> {
    override fun supports(returnType: MethodParameter, converterType: Class<out HttpMessageConverter<*>>): Boolean {
        return !(returnType.parameterType.isAssignableFrom(ResultVO::class.java) || returnType.hasMethodAnnotation(NotControllerResponseAdvice::class.java))
    }

    override fun beforeBodyWrite(
        body: Any?,
        returnType: MethodParameter,
        selectedContentType: MediaType,
        selectedConverterType: Class<out HttpMessageConverter<*>>,
        request: ServerHttpRequest,
        response: ServerHttpResponse
    ): Any? {
        if (returnType.genericParameterType.equals(String::class.java)) {
            val objectMapper = ObjectMapper()
            return objectMapper.writeValueAsString(ResultVO(body))
        }
        return ResultVO(body)
    }
}