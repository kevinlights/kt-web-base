package com.gjh.learn.kt.controller

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
data class ResultVO(val code: Int, val msg: String, val data: Any?) {
    constructor(data: Any?) : this(ResultCode.SUCCESS.code(), ResultCode.SUCCESS.msg(), data) {}
    constructor(statusCode: StatusCode, data: Any) : this(statusCode.code(), statusCode.msg(), data) {}
    constructor(statusCode: StatusCode) : this(statusCode.code(), statusCode.msg(), null) {}
}