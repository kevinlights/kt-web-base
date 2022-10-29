package com.gjh.learn.kt.controller

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
enum class ResultCode : StatusCode {
    SUCCESS {
        override fun code(): Int {
            return 1000
        }

        override fun msg(): String {
            return "request successful"
        }
    },
    FAIL {
        override fun code(): Int {
            return 1001
        }

        override fun msg(): String {
            return "request failed"
        }
    },
    VALIDATE_ERROR {
        override fun code(): Int {
            return 1002
        }

        override fun msg(): String {
            return "invalid parameters"
        }
    },
    RESPONSE_PACK_ERROR {
        override fun code(): Int {
            return 1003
        }

        override fun msg(): String {
            return "response pack failed"
        }
    },

}