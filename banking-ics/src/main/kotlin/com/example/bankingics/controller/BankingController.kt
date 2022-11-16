package com.example.bankingics.controller

import com.example.bankingics.entity.Banking
import com.example.bankingics.repository.BankingRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/bank")
class BankingController (private val bankingRepository: BankingRepository){


    @PostMapping("/")
    fun saveBanking(@RequestBody banking: Banking): ResponseEntity<Banking>{
        return ResponseEntity.ok(this.bankingRepository.save(banking))
    }

    @GetMapping("/")
    fun getBanks(): ResponseEntity<List<Banking>>{
        return ResponseEntity.ok(this.bankingRepository.findAll())
    }


    @GetMapping("/{id}")
    fun findBankById(@PathVariable("id") bankId: String?): Optional<Banking?>? {
        return bankingRepository.findByBankId(bankId)
    }

    @PutMapping("/{BankId}")
    fun updateBanking(@PathVariable bankId: String, @RequestBody banking: Banking): ResponseEntity<Banking>{

        var oldBanking = this.bankingRepository.findById(bankId).orElse(null)
        oldBanking.services_provided = banking.services_provided
        oldBanking.counter_no = banking.counter_no
        return ResponseEntity.ok(this.bankingRepository.save(banking))
    }

    @DeleteMapping("/{BankId}")
    fun deleteBanking(@PathVariable bankId: String): ResponseEntity<String>{
       this.bankingRepository.deleteById(bankId)
        return ResponseEntity.ok(bankId)

    }





}