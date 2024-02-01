package com.mespay.messaging.email;

import com.mespay.model.request.MailModel;

public interface IEmailSenderService {
    void sendEmail(MailModel mailModel);
}
