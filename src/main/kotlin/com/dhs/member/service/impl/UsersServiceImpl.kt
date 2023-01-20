package com.dhs.member.service.impl

import com.dhs.member.documents.repository.UsersRepository
import com.dhs.member.dto.RequestUserSignup
import com.dhs.member.service.UsersService
import org.springframework.stereotype.Service

@Service
class UsersServiceImpl(
    val usersRepository: UsersRepository
): UsersService {
    override fun signup(requestUserSignup: RequestUserSignup) = usersRepository.save(requestUserSignup.of()).userSeq
}