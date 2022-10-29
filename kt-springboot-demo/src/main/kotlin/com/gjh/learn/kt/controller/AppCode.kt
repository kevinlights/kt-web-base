package com.gjh.learn.kt.controller

/**
 *
 * created on 2022/10/29
 *
 * @author kevinlights
 */
enum class AppCode : StatusCode {
    APP_ERROR {
        override fun code(): Int {
            return 2000
        }

        override fun msg(): String {
            return "business error"
        }
    },
    PRICE_ERROR {
        override fun code(): Int {
            return 2001
        }

        override fun msg(): String {
            return "price error"
        }
    },
}