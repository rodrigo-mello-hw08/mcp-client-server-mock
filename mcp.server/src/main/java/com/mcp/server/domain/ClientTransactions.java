package com.mcp.server.domain;

import java.util.List;

public class ClientTransactions {
    private String cpfCnpj;
    private List<Transaction> transactions;

    public ClientTransactions(String cpfCnpj, List<Transaction> transactions) {
        this.cpfCnpj = cpfCnpj;
        this.transactions = transactions;
    }

    public ClientTransactions() {
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
