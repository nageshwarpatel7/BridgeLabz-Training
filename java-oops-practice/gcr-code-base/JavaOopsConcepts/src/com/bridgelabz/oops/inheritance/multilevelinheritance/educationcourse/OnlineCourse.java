package com.bridgelabz.oops.inheritance.multilevelinheritance.educationcourse;

public class OnlineCourse extends Course{
	public String platform;
	public boolean isRecorded;
	
	public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Type: " + (isRecorded ? "Recorded" : "Live Session"));
    }
}
