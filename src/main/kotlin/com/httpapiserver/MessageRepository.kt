package com.httpapiserver

import org.springframework.data.jpa.repository.JpaRepository

interface MessageRepository: JpaRepository<Message, String>