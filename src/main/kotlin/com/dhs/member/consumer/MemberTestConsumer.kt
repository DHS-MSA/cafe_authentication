package com.dhs.member.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MemberTestConsumer {
    @KafkaListener(topics = ["Member"], groupId = "test-group-1234")
    fun listen(data: String){
        println("data:: $data")
    }
}