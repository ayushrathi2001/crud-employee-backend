package com.sb.springboot.model;

import jakarta.persistence.*;

import lombok.Data;

@Data                                                       // Lombok annotation
@Entity                      // to make java class Employee as JPA entity
@Table(name="employees")
public class Employee {

    @Id                                                          // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}