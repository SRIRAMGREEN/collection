package com.springbatch.example.service;

import com.springbatch.example.dto.PeopleDto;
import com.springbatch.example.entity.Customer;

import java.util.List;

public interface JobService {
    List<PeopleDto> postDataFromCSV(String csvFilePath);

    List<PeopleDto> getData();
}
