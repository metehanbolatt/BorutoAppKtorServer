package com.metehanbolat.plugins

import com.metehanbolat.routes.getAllHeroes
import com.metehanbolat.routes.root
import com.metehanbolat.routes.searchHeroes
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()

        static("/images") {
            resources("images")
        }
    }
}
