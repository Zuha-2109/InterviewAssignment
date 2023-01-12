package com.example.InterviewAssignment;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aadharuser")
public class AadharController {
    @Autowired
    AadharService aadharService;

    //adding aadhar user
    @PostMapping("/add-aadhar")
    public ResponseEntity<String> addAadharUser(@RequestBody Aadhar aadhar){
        aadharService.addAadharService(aadhar);
        return new ResponseEntity<>("New user added successfully", HttpStatus.CREATED);
    }

    // getting aadhar name by id
    @GetMapping("/get-aadharname-by-id")
    public ResponseEntity<Aadhar> getaadharNameById(@RequestParam String aadharid){
        Aadhar aadhar = aadharService.getAadharNameByIdService(aadharid); // Assign user by calling service layer method Aadhar aadhar = aadharService.getAadharByNameService(aadharName);
        return new ResponseEntity<>(aadhar, HttpStatus.CREATED);
    }
}
