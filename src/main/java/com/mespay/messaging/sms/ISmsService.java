package com.mespay.messaging.sms;

import com.mespay.model.request.SmsModel;
import com.mespay.model.response.SmsResponse;

public interface ISmsService {
    public SmsResponse sendSms(SmsModel model);
}
