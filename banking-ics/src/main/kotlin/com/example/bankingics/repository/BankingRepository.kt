package com.example.bankingics.repository

import com.example.bankingics.entity.Banking
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BankingRepository : MongoRepository<Banking, String> {

    fun findByBankId(bankId: String?): Optional<Banking?>?

}