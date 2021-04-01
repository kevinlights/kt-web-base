package com.gjh.learn.kt.data

import org.springframework.data.repository.CrudRepository

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
interface ArticleRepo : CrudRepository<Article, Long> {
    fun findByTitle(title: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepo : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}