package com.example.routes

import com.example.models.comments.Comment
import com.example.models.comments.Result
import com.example.models.comments.commentResults
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.commentRouting() {
    route("/comments") {
        get("{id?}") {
            val postId =
                call.parameters["id"] ?: return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
            val comments = commentResults.filter { it.postId == postId }
            val pageNumber: Int = call.request.queryParameters["page"]?.toIntOrNull() ?: 1
            val totalResults = comments.size
            val resultsPerPage = 5
            val totalPages = (totalResults + resultsPerPage - 1) / resultsPerPage

            call.respond(
                Comment(
                    page = pageNumber,
                    results = getItemsForPage(pageNumber, resultsPerPage, comments),
                    totalPages = totalPages,
                    totalResults = totalResults
                )
            )
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