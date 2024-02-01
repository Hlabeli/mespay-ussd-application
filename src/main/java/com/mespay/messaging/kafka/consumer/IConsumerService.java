package com.mespay.messaging.kafka.consumer;

import com.mespay.model.request.MailModel;
import com.mespay.model.request.PushModel;
import com.mespay.model.request.SmsModel;

public interface IConsumerService {

    public void consumeEmail(MailModel model);

    public void consumePushNotification(PushModel model);

    public void consumeSimpleSms(SmsModel model);

}
