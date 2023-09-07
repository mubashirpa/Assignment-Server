package com.example.models.comments

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val profilePictureUrl: String? = null,
    val username: String? = null
)