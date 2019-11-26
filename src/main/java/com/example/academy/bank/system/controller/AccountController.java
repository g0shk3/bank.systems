package com.example.academy.bank.system.controller;

import com.example.academy.bank.system.model.Account;
import com.example.academy.bank.system.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping
    public void createOrUpdateCustomer(@RequestBody Account account) {
        accountService.createOrUpdateAccount(account);
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable ("accountId")  Integer accountId){
        return accountService.getAccount(accountId);
    }
}
