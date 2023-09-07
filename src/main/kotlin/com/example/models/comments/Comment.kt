package com.example.models.comments

import kotlinx.serialization.Serializable

@Serializable
data class Comment(
    val page: Int? = null,
    val results: List<Result>? = null,
    val totalPages: Int? = null,
    val totalResults: Int? = null
)

val commentResults = mutableListOf(
    Result(
        commentId = "comment1",
        content = "This is the first comment.",
        likes = listOf("user1", "user2"),
        postId = "post1",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Perry Hall",
            profilePictureUrl = "https://randomuser.me/api/portraits/men/18.jpg"
        ),
        userId = "user1"
    ),
    Result(
        commentId = "comment2",
        content = "Another comment here.",
        likes = listOf("user2", "user3"),
        postId = "post1",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Christina Wood",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/9.jpg"
        ),
        userId = "user2"
    ),
    Result(
        commentId = "comment3",
        content = "Yet another comment.",
        likes = listOf("user1", "user3"),
        postId = "post2",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Jeanette Boyd",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/24.jpg"
        ),
        userId = "user3"
    ),
    Result(
        commentId = "comment4",
        content = "Another comment here.",
        likes = listOf("user2", "user3"),
        postId = "post0",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Christina Wood",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/9.jpg"
        ),
        userId = "user2"
    ),
    Result(
        commentId = "comment5",
        content = "Yet another comment.",
        likes = listOf("user1", "user3"),
        postId = "post0",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Jeanette Boyd",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/24.jpg"
        ),
        userId = "user3"
    )
)