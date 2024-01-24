package com.mespay.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "notifier")
@Setter
@Getter
public class NotifierEntity extends BaseEntity implements Serializable {

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

    @Column(name = "is_read")
    private boolean isRead = false;

    @ManyToOne
    @JoinColumn(name = "customer_fk")
    private CustomerDetailsEntity accountDetailsEntity;

}
