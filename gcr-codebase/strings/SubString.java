import java.util.*;

public class SubString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.next();
		
		System.out.println("Enter starting index: ");
		int st = sc.nextInt();
		
		System.out.println("Enter end index: ");
		int ed = sc.nextInt();
		
		String sub = s.substring(st,ed);
		String sub1 = subStringByCharAt(s, st, ed);
		
		System.out.println("Substring by substring() method: "+sub);
		System.out.println("Substring by charAt() method: "+sub1);
		
	}
	public static String subStringByCharAt(String s, int st, int ed){
		String sub = "";
		for(int i=st;i<ed;i++)
			sub+= s.charAt(i);
		return sub;
	}
}