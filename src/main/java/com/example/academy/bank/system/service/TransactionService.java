package com.example.academy.bank.system.service;

import com.example.academy.bank.system.model.Account;
import com.example.academy.bank.system.model.Transaction;
import com.example.academy.bank.system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransactionService  {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    public void createOrUpdateTransaction(Transaction transaction){
        transactionRepository.save(transaction);
    }

    public Transaction getTransaction(Integer transactionId){
        Optional<Transaction> transaction = transactionRepository.findById(transactionId);
        if(!transaction.isPresent()){
            throw  new RuntimeException("nqma tranzakciq ");
        }
        return transaction.get();
    }

    public void withdraw(){

    }
    public void deposit(){

    }
    public void transferFunds(){

    }
}
