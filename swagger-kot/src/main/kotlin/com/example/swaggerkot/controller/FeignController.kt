package com.example.swaggerkot.controller

import com.example.swaggerkot.util.FeignServiceBankingUtil
import com.example.swaggerkot.util.FeignServiceCustomerUtil
import com.example.swaggerkot.util.FeignServiceTokenUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/swagger")
class FeignController {


    /*-----------------------BANKING--------------------------*/
    @Autowired
    private val feignServiceBankingUtil: FeignServiceBankingUtil? = null

    @GetMapping("/bank")
    fun getBankId(): String? {
        return feignServiceBankingUtil!!.getBankId()
    }


    /*-----------------------CUSTOMERS--------------------*/
    @Autowired
    private val feignServiceCustomerUtil: FeignServiceCustomerUtil? = null

    @GetMapping("/Customers")
    fun getCstId(): String? {
        return feignServiceCustomerUtil!!.getCstId()
    }


    /*-------------------------TOKEN----------------------*/
    @Autowired
    private val feignServiceTokenUtil: FeignServiceTokenUtil? = null

    @GetMapping("/token")
    fun getTknId(): String? {
        return feignServiceTokenUtil!!.getTknId()
    }


}