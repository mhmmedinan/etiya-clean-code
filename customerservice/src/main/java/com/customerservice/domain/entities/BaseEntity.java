package com.customerservice.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Column(name = "updatedDate")
    private LocalDateTime updatedDate;

    @Column(name = "deletedDate")
    private LocalDateTime deletedDate;

    @PrePersist
    protected void onCreate(){
        createdDate=LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate(){
        updatedDate=LocalDateTime.now();
    }

    @PreRemove
    protected void onDelete(){
        deletedDate=LocalDateTime.now();
    }



}
