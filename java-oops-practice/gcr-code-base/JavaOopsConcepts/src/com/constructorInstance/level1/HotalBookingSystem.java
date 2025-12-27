package com.constructorInstance.level1;

public class HotalBookingSystem {
	public String guestName;
	public String type;
	public int nights;
	public int bill;
	public HotalBookingSystem(){
		this.guestName = "Nageshwar";
		this.type = "Luxury";
		this.nights = 1;
		bill = this.nights*1000;
	}
	public HotalBookingSystem(String guestName,String type, int nights){
		this.guestName = guestName;
		this.type = type;
		this.nights = nights;
		bill = this.nights*1000;
	}
	public HotalBookingSystem(HotalBookingSystem guest){
		this.guestName = guest.guestName;
		this.type = guest.type;
		this.nights = guest.nights;
		bill = this.nights*1000;
	}	
	
	public static void main(String args[]) {
		HotalBookingSystem guest1 = new HotalBookingSystem();
		HotalBookingSystem guest2 = new HotalBookingSystem("Himesh","Delux",2);
		HotalBookingSystem guest3 = new HotalBookingSystem(guest2);
		
		System.out.println("Guest 1 stayprice: "+guest1.bill);
		System.out.println("Guest 2 stayprice: "+guest2.bill);
		System.out.println("Guest 3 stayprice: "+guest3.bill);
		
	}
}
