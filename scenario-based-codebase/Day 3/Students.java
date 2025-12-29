import java.util.*;

public class Students{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String stu[] = {"Himesh", "Lucky", "Nageshwar", "Jay", "Nitin", "Nilesh", "Raj", "Rajeev", "Prashat", "Manish"};
		
		int present = 0;
		int absent = 0;
		
		System.out.println("Enter P if present");
		System.out.println("Enter A if absent"); 
		for(String s: stu){
			System.out.print(s+" : ");
			char isPre =sc.next().charAt(0);
			
			if(isPre=='p' || isPre =='P')
				present+=1;
			else
				absent+=1;
		}
		
		System.out.println("Present students: "+present);
		System.out.println("Absent students: "+absent);
	}
}