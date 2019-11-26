package com.example.academy.bank.system.service;

import com.example.academy.bank.system.model.Account;
import com.example.academy.bank.system.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createOrUpdateAccount(Account account){
        accountRepository.save(account);
    }
    public Account getAccount(Integer accountId){
        Optional<Account> account = accountRepository.findById(accountId);
        if(!account.isPresent()){
            throw  new RuntimeException("Lud li si nqmash tolkova akaunti");
        }
        return account.get();
    }

}
