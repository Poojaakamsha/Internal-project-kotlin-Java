package com.example.bankingics.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Banking {


    @Id
    public var bankId: String? = null

    public var services_provided: String? = null

    public var counter_no: String? = null
}