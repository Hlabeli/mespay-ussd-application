package com.mespay.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class CustomerDetailsResponse implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

}
