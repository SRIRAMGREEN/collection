package com.springbatch.example.controller;

import com.springbatch.example.dto.PeopleDto;
import com.springbatch.example.entity.Customer;
import com.springbatch.example.service.JobService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;


    private PeopleDto peopleDto;


    @PostMapping("/post")
  public ResponseEntity<List<PeopleDto>> postData(@RequestParam String csvFilePath){
        List<PeopleDto> peopleDtoList = jobService.postDataFromCSV(csvFilePath);
    return  new ResponseEntity<>(peopleDtoList, HttpStatus.OK);
  }

  @GetMapping("/get")
  public ResponseEntity<List<PeopleDto>> getData(){
        List<PeopleDto> peopleDtoList = jobService.getData();
        return new ResponseEntity<>(peopleDtoList,HttpStatus.OK);
  }
}
