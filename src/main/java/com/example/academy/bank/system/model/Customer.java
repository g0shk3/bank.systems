package com.example.academy.bank.system.model;

import com.example.academy.bank.system.model.enums.SexType;
import com.sun.istack.NotNull;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "customers")
@Where(clause = "isDeleted = false")
public class Customer {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name ="names")
    private String name;


    @NotNull
    @Column(name ="address")
    private String address;

    @NotNull
    @Column(name ="sex_types")
    @Enumerated(EnumType.STRING)
    private SexType sexType;

    @NotNull
    @Column(name ="account_numbers")
    private String accountNumber;

    @Column(name ="is_deleted")
    private boolean isDeleted = false;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SexType getSexType() {
        return sexType;
    }

    public void setSexType(SexType sexType) {
        this.sexType = sexType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isDeleate() {
        return isDeleted;
    }

    public void setDeleate(boolean deleate) {
        isDeleted = deleate;
    }
}
