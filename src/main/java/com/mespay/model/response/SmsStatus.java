package com.mespay.model.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsStatus {

    private Integer groupId;
    private String groupName;
    private Integer id;
    private String name;
    private String description;
    private String action;

}
