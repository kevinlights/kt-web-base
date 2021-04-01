package com.gjh.learn.kt.data

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@Configuration
class BlogInit {
    @Bean
    fun databaseInititalizer(
        userRepo: UserRepo,
        articleRepo: ArticleRepo
    ) = ApplicationRunner {
        println("database init start")
        val userA = userRepo.save(User("usera", "A", "User"))
        articleRepo.save(Article("Spring", "headline", "some content", userA))
        articleRepo.save(Article("Java", "headline", "some content", userA))
        println("database init successfully")
    }
}