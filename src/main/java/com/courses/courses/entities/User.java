package com.courses.courses.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.antlr.v4.runtime.misc.NotNull;
import org.checkerframework.common.aliasing.qual.Unique;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Unique
    private String username;

    private String password;

    private String email;

    private boolean isActive;

    @CreationTimestamp
    private LocalDate createAt;

    @ManyToOne
    private Rol rol;

}
