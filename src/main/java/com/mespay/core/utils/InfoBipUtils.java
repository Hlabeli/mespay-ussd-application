package com.mespay.core.utils;

import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class InfoBipUtils {
    @Value("${infobip.username}")
    private String username;

    @Value("${infobip.passcode}")
    private String passcode;

    public HttpHeaders createHttpHeadersInfoBip() {

        String signature = username.concat(":".concat(SecurityUtils.twoXDecryptStringData(passcode)));

        //base 64 mine encoding
        String authorization = Base64.getMimeEncoder().encodeToString(StringUtils.getBytesUtf8(signature));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Authorization", "Basic " + authorization);
        return headers;
    }

}
