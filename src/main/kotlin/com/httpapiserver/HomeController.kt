package com.httpapiserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/messages")
class HomeController(val messageService: MessageService) {

    @GetMapping
    fun home(): List<Message> = messageService.loadMessages()

    @GetMapping("/{id}")
    fun home(@PathVariable id: Long): Message = messageService.loadOneBy(id)

    @PostMapping
    fun post(@RequestBody message: Message) = messageService.createMessage(message)
}
