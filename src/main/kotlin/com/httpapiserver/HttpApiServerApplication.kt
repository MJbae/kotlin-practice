package com.httpapiserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpApiServerApplication

fun main(args: Array<String>) {
	runApplication<HttpApiServerApplication>(*args)
}
