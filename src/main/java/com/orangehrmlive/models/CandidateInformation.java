package com.orangehrmlive.models;

public class CandidateInformation {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String vacancy;
    private final String email;
    private final String contactNumber;
    private final String keywords;
    private final String dateOfApplication;
    private final String note;
    private final String consentToKeepData;

    public CandidateInformation(String firstName, String middleName, String lastName, String vacancy, String email, String contactNumber, String keywords, String dateOfApplication, String note, String consentToKeepData) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.vacancy = vacancy;
        this.email = email;
        this.contactNumber = contactNumber;
        this.keywords = keywords;
        this.dateOfApplication = dateOfApplication;
        this.note = note;
        this.consentToKeepData = consentToKeepData;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getVacancy() {
        return vacancy;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getDateOfApplication() {
        return dateOfApplication;
    }

    public String getNote() {
        return note;
    }

    public String getConsentToKeepData() {
        return consentToKeepData;
    }
}
