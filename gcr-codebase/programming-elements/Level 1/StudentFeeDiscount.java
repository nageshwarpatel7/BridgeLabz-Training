import java.util.Scanner;
public class StudentFeeDiscount{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		float tutionFee = input.nextFloat();
		float discount = input.nextFloat();
		float discountPrice = tutionFee*discount/100;
		float finalFees = tutionFee-discountPrice;
		System.out.println("The discount amount is INR "+discountPrice+" and final discounted fee is INR "+finalFees);
	}
}