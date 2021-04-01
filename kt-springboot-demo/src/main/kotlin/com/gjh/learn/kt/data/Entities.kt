package com.gjh.learn.kt.data

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@Entity
data class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne var author: User,
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null
) {
    constructor() : this("", "", "", User("", "", ""))
}

@Entity
data class User(
    var login: String = "",
    var firstname: String = "",
    var lastname: String = "",
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null
)