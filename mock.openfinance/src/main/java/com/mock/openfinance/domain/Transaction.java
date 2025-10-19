package com.mock.openfinance.domain;

import java.math.BigDecimal;

public class Transaction {
    private BigDecimal value;
    private String description;

    public Transaction(BigDecimal value, String description) {
        this.value = value;
        this.description = description;
    }

    public Transaction() {
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
