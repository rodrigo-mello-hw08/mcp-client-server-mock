package com.mock.openfinance.controller.response;

import com.mock.openfinance.domain.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientTransactionsResponse {
    private String cpfCnpj;
    private List<TransactionResponse> transactions;
}
