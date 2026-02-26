package com.user.user.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="user2")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  Integer id;

    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

    @PrePersist
    public void prePersist(){
        LocalDateTime now=LocalDateTime.now();
        createdDate=now;
        lastModifiedDate=now;
        
    }

    @PreUpdate
    public void preUpdate(){
        lastModifiedDate=LocalDateTime.now();
    }




}
