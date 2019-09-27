package com.hackathon.datesackathon.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Service")
@Getter @Setter
@Data
public class Service {

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
