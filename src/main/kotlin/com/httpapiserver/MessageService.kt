package com.httpapiserver

import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageService(
    private val messageRepository: MessageRepository
) {
    fun loadMessages(): List<Message> = messageRepository.findAll().toList()

    fun createMessage(message: Message) {
        messageRepository.save(message)
    }

    fun loadOneBy(id: Long): Message = messageRepository.findByIdOrThrow(id)

}
