package com.gjh.learn.kt.controller

import com.gjh.learn.kt.data.Article
import com.gjh.learn.kt.data.ArticleRepo
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@RestController
@RequestMapping("/jpa")
class JpaController(private val articleRepo: ArticleRepo) {

    @GetMapping("/article")
    fun blog(): List<String> {
        return articleRepo.findAllByOrderByAddedAtDesc().map {
            it.render()
        }
    }

    @GetMapping("/article/{title}")
    fun article(@PathVariable title: String): String {
        return articleRepo.findByTitle(title)?.render() ?: throw ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "This article does not exist"
        )
    }

    fun Article.render() =
        "title:$title, headline: $headline, content: $content, author: ${author.login}, addedAt: $addedAt"
}