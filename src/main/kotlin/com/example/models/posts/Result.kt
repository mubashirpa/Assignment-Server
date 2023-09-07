package com.example.models.posts

import kotlinx.serialization.Serializable

@Serializable
data class Result(
    val comments: List<String>? = null,
    val likes: List<String>? = null,
    val multiMediaContent: List<MultiMediaContent>? = null,
    val postId: String? = null,
    val postType: PostType? = null,
    val textContent: String? = null,
    val timestamp: Long? = null,
    val user: User? = null,
    val userId: String? = null
)