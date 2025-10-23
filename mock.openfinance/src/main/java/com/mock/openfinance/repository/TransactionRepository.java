package com.mock.openfinance.repository;

import com.mock.openfinance.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    @Query("SELECT ut.transaction " +
            "FROM UserTransactions ut " +
            "WHERE ut.user.cpf = :cpf " +
            "ORDER BY ut.transaction.date DESC")
    List<Transaction> encontrarTransacoesPorCpfCnpj(@Param("cpf") String cpf);
}
