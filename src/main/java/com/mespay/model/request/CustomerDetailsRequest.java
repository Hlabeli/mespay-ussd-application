package com.mespay.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDetailsRequest implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;
    @Size(min = 4, max = 4, message = "Pin is a 4 digit number")
    @NotNull(message = "Pin cannot be empty")
    private String pin;

}
