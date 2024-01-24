package com.mespay.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Setter
@Getter
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Column(name = "date_updated")
    private Timestamp dateUpdated;

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        this.dateUpdated = new Timestamp(System.currentTimeMillis());
    }

}
