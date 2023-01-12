package com.example.InterviewAssignment;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AadharService {

    @Autowired
    AadharRepository aadharRepository;

    //adding aadhar user
    public void addAadharService(Aadhar aadhar)
    {
        aadharRepository.addAadharToDb(aadhar);
    }

    //getting aadhar Name by id
    public Aadhar getAadharNameByIdService(String aadharid){
        return aadharRepository.getAadharNameByIdFromDb(aadharid);
    }

}
