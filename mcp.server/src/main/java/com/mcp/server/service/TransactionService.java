package com.mcp.server.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcp.server.config.RestClientConfig;
import com.mcp.server.domain.ClientTransactions;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class TransactionService {

    private final RestClient restClient;
    private ObjectMapper mapper = new ObjectMapper();

    public TransactionService(RestClient restClient) {
        this.restClient = restClient;
    }

    @Tool(name = "get_transactions", description = "Get all the transactions from a client based on his cpf number")
    public String getTransactions(String cpfCnpj) {
        ClientTransactions body = restClient.get()
                .uri("/transaction/{cpfCnpj}", cpfCnpj)
                .retrieve()
                .body(ClientTransactions.class);
        try {
            return mapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Erro ao serializar ClientTransactions para JSON", e);
        }
    }

    //Debug
    public static void main(String[] args) {
        TransactionService client = new TransactionService(new RestClientConfig().restClient());
        System.out.println(client.getTransactions("0432"));
    }
}
