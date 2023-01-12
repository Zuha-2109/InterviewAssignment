package com.example.InterviewAssignment;

public class Aadhar
{
    public long aadharid;

    public String name;

    public Aadhar(long aadharid, String name){
        this.aadharid = aadharid;
        this.name = name;
    }

    public long getAadharid() {
        return aadharid;
    }

    public void setAadharid(long aadharid) {
        this.aadharid = aadharid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
