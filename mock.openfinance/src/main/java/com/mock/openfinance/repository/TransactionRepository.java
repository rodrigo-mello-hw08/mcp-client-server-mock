package com.mock.openfinance.repository;

import com.mock.openfinance.domain.Transaction;
import com.mock.openfinance.domain.ClientTransactions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class TransactionRepository {

    public static ClientTransactions get(String cpfCnpj) {
        List<Transaction> movimentacoes = Arrays.asList(
            new Transaction(new BigDecimal(150), "Pagamento de conta de luz"),
            new Transaction(new BigDecimal(200), "Compra no supermercado"),
            new Transaction(new BigDecimal(50), "Recarga de celular")
        );
        return new ClientTransactions(cpfCnpj, movimentacoes);
    }
}
