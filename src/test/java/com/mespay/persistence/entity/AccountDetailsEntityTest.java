package com.mespay.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDetailsEntityTest {

    private AccountDetailsEntity account;

    @BeforeEach
    public void setUp() {
        account =new AccountDetailsEntity();
    }

    @Test
    public void testAccountDetails() {
        account = new AccountDetailsEntity();
        account.setId(1L);
        account.setBalance(BigDecimal.valueOf(10000));
        account.setAccountNumber("2024012921");
        assertEquals("2024012921", account.getAccountNumber());
    }

}
