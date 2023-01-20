package com.dhs.member.documents.entity

import jakarta.persistence.*

@Entity(name = "USERS")
class Users (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_SEQ", nullable = false)
    val userSeq: Long = 0,
    @Column(name = "ID", nullable = false, length = 30)
    val id: String,
    @Enumerated(EnumType.STRING)
    val loginType: LoginType
)
