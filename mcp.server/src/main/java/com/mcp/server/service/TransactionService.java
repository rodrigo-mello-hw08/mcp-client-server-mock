package com.mcp.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcp.server.domain.ClientTransactions;
import com.mcp.server.domain.Transaction;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

    private ObjectMapper mapper = new ObjectMapper();

    @Tool(description = "Get client transactions by CPF/CNPJ")
    public String getTransactions(String cpfCnpj) {
        List<Transaction> movimentacoes = Arrays.asList(
                new Transaction(new BigDecimal(150), "Pagamento de conta de luz"),
                new Transaction(new BigDecimal(200), "Compra no supermercado"),
                new Transaction(new BigDecimal(50), "Recarga de celular")
        );
        ClientTransactions clientTransactions = new ClientTransactions("04230977723", movimentacoes);
        try {
            return mapper.writeValueAsString(clientTransactions);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro ao serializar ClientTransactions para JSON", e);
        }
    }
}
