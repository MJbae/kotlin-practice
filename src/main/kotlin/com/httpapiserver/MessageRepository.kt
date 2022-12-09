package com.httpapiserver

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull

interface MessageRepository : JpaRepository<Message, Long> {
    fun findByIdOrThrow(id: Long) = this.findByIdOrNull(id) ?: throw NotFoundEntityException("존재하지 않는 id : $id")
}
