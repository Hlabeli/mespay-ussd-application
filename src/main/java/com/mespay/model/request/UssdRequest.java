package com.mespay.model.request;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class UssdRequest {

    private String code;
    private String phoneNumber;
    private String pin;

}
