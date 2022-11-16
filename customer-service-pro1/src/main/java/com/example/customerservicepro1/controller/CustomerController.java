package com.example.customerservicepro1.controller;

import com.example.customerservicepro1.entity.Customer;
import com.example.customerservicepro1.repository.CustomerRepository;
import com.example.customerservicepro1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerService customerService) {this.customerService = customerService;}

    @PostMapping
    public Customer createCustomer(@RequestBody Customer cst){
        return customerService.createNewCustomer(cst);
    }

    @PostMapping(path = "/signin")
    public String signin(@RequestBody Customer customer){
        System.out.println(customer);
        return customerService.signin(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
    return customerService.getCustomers();
    }

    @GetMapping(path = "{cstId}")
    public Customer getCustomerByCstId(@PathVariable("cstId") String cstId) {
        return customerService.getCustomerByCstId(cstId);
    }

    @PutMapping(path = "{cstId}")
    public void updateCustomer(@PathVariable("cstId") String cstId, @RequestBody Customer customer){
        customerService.updateCustomer(cstId,customer);
    }



    @DeleteMapping(path = "{cstId}")
    public Customer deleteCustomer(@PathVariable("cstId") String cstId){
        return customerService.deleteCustomer(cstId);
    }



}
