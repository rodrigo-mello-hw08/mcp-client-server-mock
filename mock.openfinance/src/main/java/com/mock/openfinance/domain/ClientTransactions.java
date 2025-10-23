package com.mock.openfinance.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientTransactions {
    private String cpfCnpj;
    private List<Transaction> transactions;
}
