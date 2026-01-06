package com.oops.learningplatform;

//Short Course implementation of ICertifiable
public class ShortCourseCertificate implements Certifiable {
	 private String learnerName;
	
	 public ShortCourseCertificate(String learnerName) {
	     this.learnerName = learnerName;
	 }
	
	 @Override
	 public void generateCertificate() {
	     System.out.println("Generating Short Course Certificate for: " + learnerName);
	 }
}
