package com.dhs.member.dto

import com.dhs.member.documents.entity.LoginType
import com.dhs.member.documents.entity.Users

class RequestUserSignup(
    private val id: String,
    private val loginType: LoginType
){
    fun of(): Users = Users(id = id, loginType =  loginType)
}
