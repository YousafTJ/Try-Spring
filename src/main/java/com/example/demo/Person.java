package com.example.demo;

public class Person {
    String firstName;
    String lastName;
    String mail;
    String number;
    String description;
    String profileUrl;
    String[] qualities = new String[5];
    String[] company = new String[3];
    String[] title = new String[3];

    public Person() {
    }

    public Person(String firstName, String lastName, String mail, String number,
                  String description, String profileUrl, String[] qualities, String[] company, String[] title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.number = number;
        this.description = description;
        this.profileUrl = profileUrl;
        this.qualities = qualities;
        this.company = company;
        this.title = title;
    }


    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String[] getCompany() {
        return company;
    }

    public void setCompany(String[] company) {
        this.company = company;
    }

    public String[] getQualities() {
        return qualities;
    }

    public void setQualities(String[] qualities) {
        this.qualities = qualities;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }


}