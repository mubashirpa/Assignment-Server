package com.example.models.posts

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val page: Int? = null,
    val results: List<Result>? = null,
    val totalPages: Int? = null,
    val totalResults: Int? = null
)

val postResults = mutableListOf(
    Result(
        comments = listOf("comment4", "comment5"),
        likes = listOf("user2, user3"),
        multiMediaContent = emptyList(),
        postId = "post0",
        postType = PostType.MARKETING,
        textContent = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        timestamp = System.currentTimeMillis(),
        user = User(
            username = "Terrance Herrera",
            profilePictureUrl = "https://randomuser.me/api/portraits/men/10.jpg"
        ),
        userId = "user0"
    ),
    Result(
        comments = listOf("comment1", "comment2"),
        likes = listOf("user2"),
        multiMediaContent = listOf(
            MultiMediaContent(
                MediaType.IMAGE,
                "https://fastly.picsum.photos/id/57/2448/3264.jpg?hmac=ewraXYesC6HuSEAJsg3Q80bXd1GyJTxekI05Xt9YjfQ"
            )
        ),
        postId = "post1",
        postType = PostType.MARKETING,
        textContent = "Check out our latest product!",
        timestamp = 1630334400,
        user = User(
            username = "Perry Hall",
            profilePictureUrl = "https://randomuser.me/api/portraits/men/18.jpg"
        ),
        userId = "user1"
    ),
    Result(
        comments = listOf("comment3"),
        likes = emptyList(),
        multiMediaContent = listOf(
            MultiMediaContent(
                MediaType.IMAGE,
                "https://fastly.picsum.photos/id/22/4434/3729.jpg?hmac=fjZdkSMZJNFgsoDh8Qo5zdA_nSGUAWvKLyyqmEt2xs0"
            ),
            MultiMediaContent(
                MediaType.IMAGE,
                "https://fastly.picsum.photos/id/48/5000/3333.jpg?hmac=y3_1VDNbhii0vM_FN6wxMlvK27vFefflbUSH06z98so"
            ),
            MultiMediaContent(
                MediaType.IMAGE,
                "https://fastly.picsum.photos/id/58/1280/853.jpg?hmac=YO3QnOm9TpyM5DqsJjoM4CHg8oIq4cMWLpd9ALoP908"
            ),
        ),
        postId = "post2",
        postType = PostType.QUESTION,
        textContent = "Can anyone help me with this problem?",
        timestamp = 1630420800,
        user = User(
            username = "Christina Wood",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/9.jpg"
        ),
        userId = "user2"
    ),
    Result(
        comments = emptyList(),
        likes = listOf("user1"),
        multiMediaContent = emptyList(),
        postId = "post3",
        postType = PostType.MARKETING,
        textContent = "New arrivals in our store!",
        timestamp = 1630507200,
        user = User(
            username = "Jeanette Boyd",
            profilePictureUrl = "https://randomuser.me/api/portraits/women/24.jpg"
        ),
        userId = "user3"
    )
)