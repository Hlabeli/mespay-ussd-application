package com.mespay.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsMessage {

    private String to;
    private SmsStatus status;
    private String messageId;
    private Integer smsCount;

}
