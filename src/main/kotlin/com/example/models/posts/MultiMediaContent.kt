package com.example.models.posts

import kotlinx.serialization.Serializable

@Serializable
data class MultiMediaContent(
    val type: MediaType? = null,
    val url: String? = null
)