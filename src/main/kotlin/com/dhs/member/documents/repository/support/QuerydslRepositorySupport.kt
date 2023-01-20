package com.dhs.member.documents.repository.support

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.stereotype.Repository

@Repository
abstract class QuerydslRepositorySupport(domainClass: Class<*>?) : QuerydslRepositorySupport(domainClass!!) {
    @PersistenceContext
    override fun setEntityManager(entityManager: EntityManager) {
        super.setEntityManager(entityManager)
    }
}