package com.bridgelabz.oops.inheritance.multilevelinheritance.educationcourse;

public class PainOnlineCourse extends OnlineCourse{
	public double fee;
	public double discount;
	
	public PainOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	
	public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }
	
	@Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Price: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Total: $" + getFinalPrice());
    }
}
