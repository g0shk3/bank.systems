package com.example.academy.bank.system.repository;

import com.example.academy.bank.system.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository <Transaction, Integer> {
}
