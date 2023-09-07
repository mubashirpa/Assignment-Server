package com.example.plugins

import com.example.routes.commentRouting
import com.example.routes.postRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        postRouting()
        commentRouting()
    }
}
