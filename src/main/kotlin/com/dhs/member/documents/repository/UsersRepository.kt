package com.dhs.member.documents.repository

import com.dhs.member.documents.entity.Users
import org.springframework.data.repository.CrudRepository

interface UsersRepository : CrudRepository<Users, Long>{
}