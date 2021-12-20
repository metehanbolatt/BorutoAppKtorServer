package com.metehanbolat.plugins

import com.metehanbolat.routes.getAllHeroes
import com.metehanbolat.routes.root
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
    }
}
