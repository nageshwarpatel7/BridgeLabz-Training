import java.util.*;

public class ShoppingDiscount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of items: ");
		int item =sc.nextInt();
		
		double price =0;
		for(int i=0;i<item;i++){
			System.out.print("Enter price of "+(i+1)+" item: ");
			double pr = sc.nextDouble();
			price+= pr;
		}
		
		if(price<=5000){
			double disco = price*0.05;
			System.out.println("Total price: "+price);
			System.out.println("Discount: "+disco);
			System.out.println("Price after discount: "+(price-disco));
		}
		else if(price<=10000){
			double disco = price*0.1;
			System.out.println("Total price: "+price);
			System.out.println("Discount: "+disco);
			System.out.println("Price after discount: "+(price-disco));
		}
		else if(price<=15000){
			double disco = price*0.15;
			System.out.println("Total price: "+price);
			System.out.println("Discount: "+disco);
			System.out.println("Price after discount: "+(price-disco));
		}
		else{
			double disco = price*0.20;
			System.out.println("Total price: "+price);
			System.out.println("Discount: "+disco);
			System.out.println("Price after discount: "+(price-disco));
		}
	}
}