package com.example.customerservicepro1.repository;

import com.example.customerservicepro1.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByCstId(String cstId);

    Optional<Customer> findCustomerByEmail(String email);
}

