package com.mock.openfinance.controller;

import com.mock.openfinance.domain.ClientTransactions;
import com.mock.openfinance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @GetMapping(path = "/{cpfCnpj}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClientTransactions> obterMovimentacoesCliente(@PathVariable("cpfCnpj") String cpfCnpj) {
        System.out.println("CNPJ/CPF recebido: " + cpfCnpj);
        ClientTransactions clientTransactions = service.obterMovimentacoesCliente(cpfCnpj);
        return ResponseEntity.ok(clientTransactions);
    }
}
