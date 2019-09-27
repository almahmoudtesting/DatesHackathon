package com.hackathon.datesackathon.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@Table(name = "Request")
@Entity
@Getter @Setter
public class Request {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String price;

    @Column
    private String city;

    @Column
    private LocalDateTime serviceDate;

    @Column
    private String type;

    @Column
    private String status;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Users userId;
}
