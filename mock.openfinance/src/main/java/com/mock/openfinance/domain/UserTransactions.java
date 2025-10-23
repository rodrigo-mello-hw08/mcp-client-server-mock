package com.mock.openfinance.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_user_transaction")
@Entity
public class UserTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_transaction", nullable = false)
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

}
