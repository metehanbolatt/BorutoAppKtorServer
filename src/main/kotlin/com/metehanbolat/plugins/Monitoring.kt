package com.metehanbolat.plugins

import io.ktor.features.*
import org.slf4j.event.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureMonitoring() {
    install(CallLogging)

}
