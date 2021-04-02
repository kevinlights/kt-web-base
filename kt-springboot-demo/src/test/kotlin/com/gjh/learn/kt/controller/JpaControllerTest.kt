//package com.gjh.learn.kt.controller
//
//import com.gjh.learn.kt.data.Article
//import com.gjh.learn.kt.data.ArticleRepo
//import com.gjh.learn.kt.data.User
//import org.junit.jupiter.api.Test
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
//import org.springframework.boot.test.mock.mockito.MockBean
//import org.springframework.http.MediaType
//import org.springframework.test.web.servlet.MockMvc
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
//
///**
// *
// * created on 2021/4/2
// *
// * @author kevinlights
// */
//@WebMvcTest
//class JpaControllerTest(@Autowired val mockMvc: MockMvc) {
//
//    @MockBean
//    private lateinit var userRepo: ArticleRepo
//
//    @MockBean
//    private lateinit var articleRepo: ArticleRepo
//
//    @Test
//    fun `List articles`() {
//        val userA = User("usera", "A", "User")
//        val spring5Article = Article("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", userA)
//        val spring43Article = Article("Spring Framework 4.3 goes GA", "Dear Spring community ...", "Lorem ipsum", userA)
//
//        mockMvc.perform(get("/jpa/article/").accept(MediaType.APPLICATION_JSON))
//            .andExpect(status().isOk)
//            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
//            .andExpect(jsonPath("\$.[0].author.login").value(userA.login))
//    }
//}