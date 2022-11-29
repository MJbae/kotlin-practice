package com.httpapiserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/home")
class HomeController {

    @GetMapping
    fun home(): List<Message> = messageService.loadMessages()

    @PostMapping
    fun post(@RequestBody message: Message) = messageService.createMessage(message)
}
