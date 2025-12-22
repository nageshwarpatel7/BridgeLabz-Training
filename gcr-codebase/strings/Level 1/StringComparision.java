import java.util.*;

public class StringComparision{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 strings: ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		boolean equalString = compare(s1, s2);
		boolean isEqual = s1.equals(s1);
		if(equalString==isEqual)
			System.out.println("Both strings are equal");
		else
			System.out.println("Not equal string");
	}
	public static boolean compare(String s1, String s2){
		if(s1.length() != s2.length())
			return false;
		for(int i=0;i<s1.length();i++)
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
			
		return true;
	}
}