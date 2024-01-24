package com.mespay.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class AccountDetailsResponse implements Serializable {

    private Long id;
    private String accountNumber;
    private BigDecimal balance;

}
