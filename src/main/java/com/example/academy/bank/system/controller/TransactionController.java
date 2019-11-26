package com.example.academy.bank.system.controller;


import com.example.academy.bank.system.model.Account;
import com.example.academy.bank.system.model.Transaction;
import com.example.academy.bank.system.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @PostMapping
    public void createOrUpdateTransaction(@RequestBody Transaction transaction) {
        transactionService.createOrUpdateTransaction(transaction);
    }
    @GetMapping("/{transactionId}")
    public Transaction getTransaction(@PathVariable ("transactionId")  Integer transactionId){
        return transactionService.getTransaction(transactionId);
    }

}
