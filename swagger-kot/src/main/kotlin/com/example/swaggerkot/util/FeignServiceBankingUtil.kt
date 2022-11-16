package com.example.swaggerkot.util

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "Banking-ics", url = "http://localhost:9001/bank/")
interface FeignServiceBankingUtil {

    @GetMapping("/bank")
    fun getBankId(): String?
}