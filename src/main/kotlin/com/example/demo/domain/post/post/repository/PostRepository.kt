package com.example.demo.domain.post.post.repository

import com.example.demo.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>