import java.util.*;

public class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		boolean ans = isLeapYear(year);
		if(ans)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");
	}
	public static boolean isLeapYear(int y){
		if(y>=1582 && ((y%4==0 && y%100!=0) ||(y%400==0)))
			return true;
		return false;
	}
}