package com.springbatch.example.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Entity
@Table(name="customer_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @Column(name="index")
    private int id;

    @Column(name="customer_id")
    private String customerId;

    private String firstName;

    private String lastName;

    private String gender;

    private String email;

    private String phone;

    private Date date;

    private String jobTitle;
}
