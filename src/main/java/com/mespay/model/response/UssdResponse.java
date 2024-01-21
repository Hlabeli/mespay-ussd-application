package com.mespay.model.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Map;

@Setter
@Getter
@ToString
@EqualsAndHashCode
public class UssdResponse implements Serializable {

    private Map<String, String> message;

}
