package com.mespay.persistence.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerDetailsEntityTest {

    private CustomerDetailsEntity customer;

    @BeforeEach
    public void setup() {
        customer = new CustomerDetailsEntity();
    }

    @Test
    public void testCustomerDetails() {
        AccountDetailsEntity account = new AccountDetailsEntity();
        account.setBalance(BigDecimal.valueOf(1000));
        account.setAccountNumber("2019092921");

        customer = new CustomerDetailsEntity();
        customer.setId(1L);
        customer.setPin("1234");
        customer.setEmail("bob@gmail.com");
        customer.setFirstName("Bob");
        customer.setLastName("Alice");
        customer.setTelephone("62000000");
        customer.setAccountDetailsEntity(account);

        assertEquals("1234", customer.getPin());
    }

}
