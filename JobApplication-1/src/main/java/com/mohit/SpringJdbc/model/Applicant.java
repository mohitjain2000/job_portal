package com.mohit.SpringJdbc.model;
public class Applicant {

    private String fullName;
    private String email;
    private String phoneNumber;
    private String resume;  // Assuming resume is stored as a path or byte array
    private int jobId;     // Foreign key to reference the job applied for

    // Getters and Setters (omitted for brevity)

    public Applicant(String fullName, String email, String phoneNumber, String resume, int jobId) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.resume = resume;
        this.jobId = jobId;
    }

    // Additional methods for validation, data processing, etc. (optional)

}
