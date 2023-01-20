package com.dhs.member.service

import com.dhs.member.dto.RequestUserSignup

interface UsersService {
    fun signup(requestUserSignup: RequestUserSignup): Long
}