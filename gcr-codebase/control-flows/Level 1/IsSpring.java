import java.util.*;

public class IsSpring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		if((month==3 && day>=20) || (month==6 && day<=20))
			System.out.println("Its a spring Season");
		else if(month>3 && month<6)
			System.out.println("Its a sprint Season");
		else
			System.out.println("Not a spring Season");
	}
}