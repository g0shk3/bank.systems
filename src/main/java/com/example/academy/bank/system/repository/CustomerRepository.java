package com.example.academy.bank.system.repository;

import com.example.academy.bank.system.model.Customer;
import com.example.academy.bank.system.model.enums.AccountType;
import org.hibernate.usertype.UserType;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    @Query("SELECT c FROM  Customer c where accountType=:accountType")
    List<Customer> getByAccountType(@Param("accountType") AccountType accountType);

    @Modifying
    @Query("UPDATE Customer SET isDeleted = true WHERE customerId = :customerId")
    void deactivateCustomer(@Param("customerId") Integer customerId);
}
