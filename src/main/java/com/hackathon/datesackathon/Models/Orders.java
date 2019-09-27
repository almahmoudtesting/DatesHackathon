package com.hackathon.datesackathon.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter @Setter
@Table(name = "Orders")
public class Orders {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service serviceId;

    @ManyToOne
    @JoinColumn(name = "requestId")
    private Request requestId;
}
