package com.springbatch.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeopleDto {

    private int id;

    private String customerId;

    private String firstName;

    private String lastName;

    private String gender;

    private String email;

    private String phone;

    private Date date;

    private String jobTitle;
}
