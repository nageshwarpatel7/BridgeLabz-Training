package com.oops.learningplatform;

public class Certificate {
    private String learnerName;
    private String courseName;

    public Certificate(String learnerName, String courseName) {
        this.learnerName = learnerName;
        this.courseName = courseName;
    }

    public void displayCertificate() {
        System.out.println("Certificate awarded to: " + learnerName + " for completing the " + courseName);
    }
}
