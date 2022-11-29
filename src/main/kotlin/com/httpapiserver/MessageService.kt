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

    fun loadOneBy(id: Long): List<Message> = messageRepository.findById(id).toList()

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
