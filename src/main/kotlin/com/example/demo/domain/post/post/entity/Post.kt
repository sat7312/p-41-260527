package com.example.demo.domain.post.post.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import org.springframework.data.annotation.Id

@Entity
class Post(
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    var id: Long? = null,
    var title: String,
    var content: String
)