package com.cc.java;

public class Mitarbeiter {
    private String firstName;
    private String familyName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String firstName, String familyName, String role, int yearOfEntry) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getFamilyName() {
        return familyName;
    }

    private String getRole() {
        return role;
    }

    private int getYearOfEntry() {
        return yearOfEntry;
    }

    public String getInfo() {
        return "\033[0;42m\033[1;34m" + this.getFirstName() + " " + this.getFamilyName() + "\t" + " ist als " + this.getRole() + " im Jahr " +  this.getYearOfEntry() + " in das Unternehmen eingetreten.";
    }   
}
