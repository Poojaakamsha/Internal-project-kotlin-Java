package com.example.bankingics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class BankingIcsApplication

fun main(args: Array<String>) {
	runApplication<BankingIcsApplication>(*args)
}
