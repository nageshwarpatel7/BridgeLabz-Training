package com.oops.learningplatform;

public class FullTimeCourseCertificate implements Certifiable {
	 private String learnerName;
	
	 public FullTimeCourseCertificate(String learnerName) {
	     this.learnerName = learnerName;
	 }
	
	 @Override
	 public void generateCertificate() {
	     System.out.println("Generating Full-Time Course Certificate for: " + learnerName);
	 }
}