import java.util.*;

public class PalindromChecker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string to check palindrome: ");
		String s = sc.next();
		
		if(isPalin(s.toLowerCase()))
			System.out.println(s+" is a palindrome");
		else
			System.out.println(s+" is not a palindrome");
		
	}
	public static boolean isPalin(String s){
		int st =0;
		int ed = s.length()-1;
		
		while(st<ed){
			if(s.charAt(st)!=s.charAt(ed))
				return false;
			st++;
			ed--;
		}
		return true;
	}
}