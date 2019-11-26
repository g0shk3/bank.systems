package com.example.academy.bank.system.model;

import com.example.academy.bank.system.model.enums.AccountType;
import com.example.academy.bank.system.model.enums.CurrencyType;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name ="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="id")
    private Integer id;

    @NotNull
    @Column(name ="balance")
    private double balance;

    @NotNull
    @Column(name ="iban")
    private String iban;

    @NotNull
    @Column(name ="account_types")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @NotNull
    @Column(name ="currency_types")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Integer getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
