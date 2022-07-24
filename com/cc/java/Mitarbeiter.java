package com.cc.java;

public class Mitarbeiter {
    
    private String firstname;
    private String familyName;
    private String role;
    private int yearOfEntry;
  

    public Mitarbeiter(String firstname, String familyName, String role, int yearOfEntry) {
        this.firstname = firstname;
        this.familyName = familyName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }


    public String getInfo(String flag) {
        switch (flag) {
            case "#name":
                return firstname;
            case "#familyName":
                return familyName;
            case "#role":
                return role;
            case "#yearOfEntry":
                return String.valueOf(yearOfEntry);
            default:
                return "ERROR";
        }
    }

}

