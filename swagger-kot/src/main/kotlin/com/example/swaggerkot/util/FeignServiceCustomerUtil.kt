package com.example.swaggerkot.util

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "customer-service-pro1", url = "http://localhost:4001/customer")
interface FeignServiceCustomerUtil {

    @GetMapping("/Customers")
    fun getCstId(): String?
}