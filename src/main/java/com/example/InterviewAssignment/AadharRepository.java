package com.example.InterviewAssignment;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class AadharRepository {

    public HashMap<String, Aadhar> aadharMap = new HashMap<>();

    //adding aadhar user
    public void addAadharToDb(Aadhar aadhar){

        aadharMap.put(aadhar.getName(), aadhar);
    }

    //getting aadhar user name by id
    public Aadhar getAadharNameByIdFromDb(String aadharid){

        return aadharMap.get(aadharid);
    }

}
