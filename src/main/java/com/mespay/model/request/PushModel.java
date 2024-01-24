package com.mespay.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PushModel implements Serializable {

    private Long custId;
    private String subject = "";
    private String message = "";
    private boolean isRead = false;

}
