package com.example.swaggerkot.util

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "token-service-pro1", url = "http://localhost:4005/token")
interface FeignServiceTokenUtil {

    @GetMapping("/token")
    fun getTknId(): String?

}