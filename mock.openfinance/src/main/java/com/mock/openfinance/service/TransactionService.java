package com.mock.openfinance.service;

import com.mock.openfinance.controller.response.ClientTransactionsResponse;
import com.mock.openfinance.domain.ClientTransactions;
import com.mock.openfinance.domain.Transaction;
import com.mock.openfinance.mapper.ClientTransactionsMapper;
import com.mock.openfinance.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    @Autowired
    private final TransactionRepository repository;

    public ClientTransactionsResponse obterMovimentacoesCliente(String cpfCnpj) {
        List<Transaction> transactions = repository.encontrarTransacoesPorCpfCnpj(cpfCnpj);
        ClientTransactions clientTransactions = new ClientTransactions(cpfCnpj, transactions);
        return ClientTransactionsMapper.toResponse(clientTransactions);
    }
}
