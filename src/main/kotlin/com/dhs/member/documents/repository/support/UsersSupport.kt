package com.dhs.member.documents.repository.support

import com.dhs.member.documents.entity.Users

interface UsersSupport {
    fun getUsers(): List<Users>
}