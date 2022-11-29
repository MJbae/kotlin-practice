package com.httpapiserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/home")
class HomeController {

    @GetMapping
    fun home(@RequestParam(value = "name") name: String?) = listOf(
        Message("1", "hello"),
        Message("2", "$name"),
        Message("3", "who u r")
    )
}
