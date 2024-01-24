package com.mespay.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Setter
@Getter
public class CustomerDetailsEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telephone", unique = true, nullable = false)
    private String telephone;

    @Column(name = "pin_no", length = 500)
    private String pin;

    @OneToOne
    @JoinColumn(name = "account_fk")
    private AccountDetailsEntity accountDetailsEntity;

}
