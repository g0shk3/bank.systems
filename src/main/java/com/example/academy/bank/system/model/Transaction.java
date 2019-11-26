package com.example.academy.bank.system.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "account_numbers")
    private String accountNumber;

    @Column(name = "balance")
    private double balance;

    @NotNull
    @Column(name = "dates")
    private LocalDate date = LocalDate.now();

    @NotNull
    @ManyToOne
    @JoinColumn(name ="account_id")
    private Account account;

    @NotNull
    @ManyToOne
    @JoinColumn(name ="card_id")
    private Card card;


    @Column(name = "withdraws")
    private double withdraw;


    @Column(name = "deposits")
    private double deposit;

    public Integer getId() {
        return id;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
