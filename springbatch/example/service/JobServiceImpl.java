package com.springbatch.example.service;

import com.springbatch.example.dto.PeopleDto;
import com.springbatch.example.entity.Customer;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private PeopleDto storedPeopleDto;
    List<PeopleDto> peopleDtoList = new ArrayList<>();


    @Override
    public List<PeopleDto> postDataFromCSV(String csvFilePath) {

        csvFilePath = "src/main/resources/peoples.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            // Skip the header if needed
            br.readLine(); // Assuming the first line is header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Assuming CSV data is comma-separated

                // Assuming the CSV columns are in the order: id, customerId, firstName, lastName, gender, email, date, phone, jobTitle
                PeopleDto peopleDto = new PeopleDto();
                peopleDto.setId(Integer.parseInt((data[0])));
                peopleDto.setCustomerId((data[1]));
                peopleDto.setFirstName(data[2]);
                peopleDto.setLastName(data[3]);
                peopleDto.setGender(data[4]);
                peopleDto.setEmail(data[5]);
                peopleDto.setPhone(data[6]);
                // Parsing date in the format yyyy-mm-dd
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date parsedDate =  dateFormat.parse(data[7]);
                peopleDto.setDate(parsedDate);
                peopleDto.setJobTitle(data[8]);

                peopleDtoList.add(peopleDto);
                // Store the last DTO object in the list
                if (!peopleDtoList.isEmpty()) {
                    storedPeopleDto = peopleDtoList.get(peopleDtoList.size() - 1);
                    peopleDtoList.add(storedPeopleDto);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file reading error
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return peopleDtoList;
    }


    @Override
    public List<PeopleDto> getData() {
        return peopleDtoList;
    }
}
