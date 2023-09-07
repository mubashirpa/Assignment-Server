package com.example.models.comments

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val commentId: String? = null,
    val content: String? = null,
    val likes: List<String>? = null,
    val postId: String? = null,
    val timestamp: Long? = null,
    val user: User? = null,
    val userId: String? = null
)