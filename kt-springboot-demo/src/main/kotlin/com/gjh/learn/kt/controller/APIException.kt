package com.gjh.learn.kt.controller


/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
class APIException : RuntimeException {
    internal var code: Int
    internal var msg: String

    constructor(msg: String) : super(msg) {
        this.code = AppCode.APP_ERROR.code()
        this.msg = AppCode.APP_ERROR.msg()
    }

    constructor(statusCode: StatusCode, msg: String) : super(msg) {
        this.code = statusCode.code()
        this.msg = statusCode.msg()
    }
}