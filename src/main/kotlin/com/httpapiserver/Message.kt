package com.httpapiserver

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "messages")
class Message(@Id var id: String, val text: String)
