package com.mock.openfinance.service;

import com.mock.openfinance.domain.ClientTransactions;
import com.mock.openfinance.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public ClientTransactions obterMovimentacoesCliente(String cpfCnpj) {
        return TransactionRepository.get(cpfCnpj);
    }
}
