package com.example.academy.bank.system.repository;

import com.example.academy.bank.system.model.Account;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

    @Modifying
    @Query("Select a FROM Account a WHERE customer.id = :customerId")
    Optional<List<Account>> getAccountByCustomerId(@Param("customerId") Integer customerId);

}
