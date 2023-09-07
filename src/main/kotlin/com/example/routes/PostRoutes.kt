package com.example.routes

import com.example.models.posts.Post
import com.example.models.posts.Result
import com.example.models.posts.postResults
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.postRouting() {
    route("/posts") {
        get {
            if (postResults.isNotEmpty()) {
                val pageNumber: Int = call.request.queryParameters["page"]?.toIntOrNull() ?: 1
                val totalResults = postResults.size
                val resultsPerPage = 5
                val totalPages = (totalResults + resultsPerPage - 1) / resultsPerPage

                call.respond(
                    Post(
                        page = pageNumber,
                        results = getItemsForPage(pageNumber, resultsPerPage, postResults),
                        totalPages = totalPages,
                        totalResults = totalResults
                    )
                )
            } else {
                call.respondText("No posts found", status = HttpStatusCode.OK)
            }
        }
        get("{id?}") {
            val postId =
                call.parameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
            val post = postResults.find { it.postId == postId } ?: return@get call.respondText(
                "Not Found",
                status = HttpStatusCode.NotFound
            )
            call.respond(post)
        }
        post {
            val result = call.receive<Result>()
            postResults.add(result)
            call.respondText("Customer stored correctly", status = HttpStatusCode.Created)
        }
        delete("{id?}") {
            val postId = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
            if (postResults.removeIf { it.postId == postId }) {
                call.respondText("Customer removed correctly", status = HttpStatusCode.Accepted)
            } else {
                call.respondText("Not Found", status = HttpStatusCode.NotFound)
            }
        }
    }
}

fun getItemsForPage(pageNumber: Int, resultsPerPage: Int, itemList: List<Result>): List<Result> {
    val maxPages = (itemList.size + resultsPerPage - 1) / resultsPerPage // Calculate the maximum number of pages

    return if (pageNumber <= maxPages) {
        val startIndex = (pageNumber - 1) * resultsPerPage
        val endIndex = minOf(startIndex + resultsPerPage, itemList.size)
        itemList.subList(startIndex, endIndex)
    } else {
        // Return an empty list or a message indicating that the page doesn't exist
        emptyList()
    }
}