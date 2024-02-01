package com.mespay.messaging.sms.impl;

import com.mespay.core.utils.AppUtils;
import com.mespay.core.utils.InfoBipUtils;
import com.mespay.messaging.sms.ISmsService;
import com.mespay.model.request.SmsModel;
import com.mespay.model.response.SmsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class SmsServiceImpl implements ISmsService {

    private final RestTemplate restTemplate;
    private final InfoBipUtils infoBipUtils;

    @Value("${infobip.base-url}")
    private String smsBaseUrl;
    @Override
    public SmsResponse sendSms(SmsModel model) {
        String url = smsBaseUrl + "/sms/1/text/single";
        HttpHeaders headers = infoBipUtils.createHttpHeadersInfoBip();
        HttpEntity<SmsModel> entity = new HttpEntity<>(model, headers);
        ResponseEntity<SmsResponse> response = restTemplate.exchange(url, HttpMethod.POST, entity, SmsResponse.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("sms response object ::: {}", AppUtils.toJson(response));
            return response.getBody();
        }
        return null;
    }
}
