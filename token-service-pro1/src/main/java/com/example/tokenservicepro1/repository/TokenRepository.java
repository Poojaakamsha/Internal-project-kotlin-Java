package com.example.tokenservicepro1.repository;

import com.example.tokenservicepro1.entity.Token;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends MongoRepository<Token, String> {
    Token findByTknId(String cstId, String bankId);
}
