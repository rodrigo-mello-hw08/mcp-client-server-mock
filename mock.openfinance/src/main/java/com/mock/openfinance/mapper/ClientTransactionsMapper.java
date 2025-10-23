package com.mock.openfinance.mapper;

import com.mock.openfinance.controller.response.ClientTransactionsResponse;
import com.mock.openfinance.controller.response.TransactionResponse;
import com.mock.openfinance.domain.ClientTransactions;
import com.mock.openfinance.domain.Transaction;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

@UtilityClass
public class ClientTransactionsMapper {

    public ClientTransactionsResponse toResponse(ClientTransactions domain) {
        if (isNull(domain)) return null;

        List<TransactionResponse> transactions = new ArrayList<>();
        for (Transaction transaction: domain.getTransactions()) {
            TransactionResponse transactionResponse = new TransactionResponse(transaction.getValue(), transaction.getDescription(), transaction.getDate());
            transactions.add(transactionResponse);
        }
        return new ClientTransactionsResponse(domain.getCpfCnpj(), transactions);
    }
}
