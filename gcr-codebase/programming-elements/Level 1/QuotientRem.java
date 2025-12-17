import java.util.Scanner;
class QuotientRem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int quotient =  num1/num2;
		int reminder = num1%num2;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+num1+" and "+num2);
	}
}