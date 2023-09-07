package com.example.models.posts

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val profilePictureUrl: String? = null,
    val username: String? = null
)