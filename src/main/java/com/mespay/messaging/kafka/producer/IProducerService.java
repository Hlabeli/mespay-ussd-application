package com.mespay.messaging.kafka.producer;

import com.mespay.model.request.MailModel;
import com.mespay.model.request.PushModel;
import com.mespay.model.request.SmsModel;

public interface IProducerService {

    public void sendEmail(MailModel model);

    public void sendPush(PushModel model);

    public void sendSms(SmsModel model);

}
