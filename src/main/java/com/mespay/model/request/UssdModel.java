package com.mespay.model.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "ussd.service.code")
public class UssdModel {

    private String exit;
    private String previous;
    private String init;
    private String create;
    private String deposit;
    private String withdrawal;
    private String balance;

}
