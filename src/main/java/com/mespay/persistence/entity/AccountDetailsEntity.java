package com.mespay.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
@Setter
@Getter
public class AccountDetailsEntity extends BaseEntity implements Serializable {
    @Column(name = "account_number", unique = true)
    private String accountNumber;

    @Column(name = "balance")
    private BigDecimal balance;

}
