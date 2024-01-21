package com.mespay.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class SmsResponse {

    private String bulkId;
    private Set<SmsMessage> messages;

}
