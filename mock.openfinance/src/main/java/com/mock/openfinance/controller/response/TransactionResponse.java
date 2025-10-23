package com.mock.openfinance.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private BigDecimal value;
    private String description;
    private Date date;
}
