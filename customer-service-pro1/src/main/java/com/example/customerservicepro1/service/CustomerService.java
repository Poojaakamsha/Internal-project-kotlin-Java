package com.example.customerservicepro1.service;

import com.example.customerservicepro1.entity.Customer;
import com.example.customerservicepro1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer createNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository
                .findCustomerByEmail(customer.getEmail());
        if(customerOptional.isPresent()){
            throw new IllegalStateException("Email already taken!");
        }
        return customerRepository.save(customer);
    }




    public Customer deleteCustomer(String cstId) {
        boolean exists = customerRepository.existsById(cstId);
        if(!exists){
            throw new IllegalStateException(
                    "Customer with ID : " + cstId + " does not exist."
            );
        }
        customerRepository.deleteById(cstId);

        return null;
    }

    public ResponseEntity<Customer> updateCustomer(String cstId, Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findById(cstId);
        if(customerOptional.isPresent()){
            Customer _customer = customerOptional.get();
            _customer.setEmail(customer.getEmail());
            _customer.setPassword(customer.getPassword());
            _customer.setName(customer.getName());
            _customer.setAccount_number(customer.getAccount_number());
            _customer.setService_requested(customer.getAccount_number());
            _customer.setCountry(customer.getCountry());
            _customer.setPhone(customer.getPhone());

            return new ResponseEntity<>(customerRepository.save(_customer), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    public Customer getCustomerByCstId(String cstId) {
        Optional<Customer> customerOptional = customerRepository.findById(cstId);
        if(customerOptional.isPresent()){
            return customerRepository.findByCstId(cstId);
        }
        else {
            throw new IllegalStateException("Customer with ID" +
                    cstId + " does not exist.");
        }
    }

    public String signin(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(customer.getEmail());
        if(customerOptional.isPresent()){
            Customer _customer = customerOptional.get();
            if(customer.getPassword().equals(_customer.getPassword())){
                return "valid";
            }
        }
        return "invalid";

    }



}
