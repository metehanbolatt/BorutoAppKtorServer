package com.metehanbolat

import io.ktor.application.*
import com.metehanbolat.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
    configureStatusPages()
}
