package com.hackathon.datesackathon.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Getter @Setter
@Data
public class Users {

    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private LocalDateTime dateOfBirth;

    @Column
    private String description;

    @Column
    private String verificationLink;
}
