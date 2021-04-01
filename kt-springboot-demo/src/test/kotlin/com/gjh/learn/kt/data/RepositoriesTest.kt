package com.gjh.learn.kt.data

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

/**
 *
 * created on 2021/4/2
 *
 * @author kevinlights
 */
@DataJpaTest
class RepositoriesTest @Autowired constructor(
    val entityManager: TestEntityManager,
    val userRepo: UserRepo,
    val articleRepo: ArticleRepo
) {
    @Test
    fun `When findByIdOrNull then return Article`() {
        val userA = User("usera", "A", "User")
        entityManager.persist(userA)
        val articleA = Article("Spring", "headline", "some content", userA)
        entityManager.persist(articleA)
        entityManager.flush()
        val found = articleRepo.findByIdOrNull(articleA.id!!)
        println(found)
    }

    @Test
    fun `When findByLogin then return User`() {
        val userA = User("usera", "A", "User")
        entityManager.persist(userA)
        entityManager.flush()
        val user = userRepo.findByLogin(userA.login)
        println(user)
    }
}