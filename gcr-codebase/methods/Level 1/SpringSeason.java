import java.util.*;

public class SpringSeason{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");
		String month = sc.next();
		
		System.out.print("Enter date: ");
		int date = sc.nextInt();
		
		boolean ans = isSpringSeason(date, month);
		if(ans)
			System.out.println("Its a Spring Season");
		else
			System.out.println("Not a Spring Season");
	}
	public static boolean isSpringSeason(int date, String month){
		if((month.equalsIgnoreCase("March") && date>=20) || (month.equalsIgnoreCase("June") && date<=20))
			return true;
		else if(month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
			return true;
		else
			return false;
	}
}