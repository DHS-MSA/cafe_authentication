package com.dhs.member.documents.repository.support.impl

import com.dhs.member.documents.entity.Users
import com.dhs.member.documents.repository.support.QuerydslRepositorySupport
import com.dhs.member.documents.repository.support.UsersSupport
import com.querydsl.jpa.impl.JPAQueryFactory

class UsersSupportImpl(
    private val query: JPAQueryFactory,
): QuerydslRepositorySupport(Users::class.java), UsersSupport {
    override fun getUsers(): List<Users> {
        TODO("Not yet implemented")
    }
}