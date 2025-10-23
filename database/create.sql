CREATE TABLE tb_user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

CREATE TABLE tb_transaction (
    id SERIAL PRIMARY KEY,
    value NUMERIC(10,2) NOT NULL,
    description VARCHAR(100) NOT NULL,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE tb_user_transaction (
    id SERIAL PRIMARY KEY,
    id_user INT NOT NULL,
    id_transaction INT NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (id_user) REFERENCES tb_user (id),
    CONSTRAINT fk_transaction FOREIGN KEY (id_transaction) REFERENCES tb_transaction (id)
);