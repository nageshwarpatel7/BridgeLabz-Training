import java.util.*;

public class IsSpring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		int day = sc.nextInt();
		month = month.toLowerCase();
		if((month.equals("march") && day>=10) || (month.equals("June") && day<=20))
			System.out.println("Its a spring Season");
		else if(month.equals("april") || month.equals("may"))
			System.out.println("Its a sprint Season");
		else
			System.out.println("Not a spring Season");
	}
}