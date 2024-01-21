package com.mespay.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CurrencyResponse {

    private String base;
    private String date;
    @JsonProperty("time_last_updated")
    private Long timeLastUpdated;
    private CurrencyRate rate;

}
