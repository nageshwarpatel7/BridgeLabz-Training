/* The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. 
Write a program to find the discounted amount and discounted price the student will pay for the course. */ 

public class FeeDiscount{
	public static void main(String args[]){
		float tutionFee = 125000;
		float discount = 10;
		float discountPrice = tutionFee*discount/100;
		float finalFees = tutionFee-discountPrice;
		System.out.println("The discount amount is INR "+discountPrice+" and final discounted fee is INR "+finalFees);
	}
}