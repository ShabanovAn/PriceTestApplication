package com.example.pricetestapplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "price")
public class Price {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_code")
    private String product_code;
    @Column(name = "number")
    private int number;
    @Column(name = "depart")
    private int depart;
    @Column(name = "begin")
    private Date begin;
    @Column(name = "end")
    private Date end;
    @Column(name = "value")
    private Long value;

}
