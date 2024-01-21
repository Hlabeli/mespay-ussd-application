package com.mespay.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SmsModel implements Serializable {

    @NotNull
    @Size(min = 3, max = 11, message = "minimum character is 3 and maximum is 11")
    private String from;

    @NotNull
    private List<String> to = new ArrayList<>();

    @NotNull
    private String text;

}
