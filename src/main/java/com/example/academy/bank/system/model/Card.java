package com.example.academy.bank.system.model;

import com.example.academy.bank.system.model.enums.CardType;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name ="cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "balance")
    private double balance;

    @NotNull
    @Column(name = "card_numbers")
    private String cardNumber;

    @NotNull
    @Column(name = "pin_codes")
    private String pinCode;

    @NotNull
    @Column(name = "card_types")
    @Enumerated(EnumType.STRING)
    private CardType cardType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Integer getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
