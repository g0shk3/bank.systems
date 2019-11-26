package com.example.academy.bank.system.controller;


import com.example.academy.bank.system.model.Customer;
import com.example.academy.bank.system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.PrintWriter;
import java.io.StringWriter;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

        private final CustomerService customerService;

        @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createOrUpdateCustomer(@RequestBody Customer customer) {
        customerService.createOrUpdateCustomer(customer);
    }


    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable ("customerId")  Integer customerId){
       return customerService.getCustomer(customerId);
    }

    @DeleteMapping("/{customerId}")
    public void deletedCustomer(@PathVariable("customerId") Integer customerId) {
        customerService.deletedCustomer(customerId);
    }



    @ExceptionHandler({Exception.class})
    public  String onExeption(Exception e){
        StringWriter sw =  new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
        return exceptionAsString;
    }

}
