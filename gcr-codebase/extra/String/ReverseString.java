import java.util.*;

public class ReverseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		String revStr = reverseString(s);
		
		System.out.println("Reversed String is: "+reverseString(s));
	}
	public static String reverseString(String s){
		String ans ="";
		int ed = s.length()-1;
		
		for(int i=ed;i>=0;i--)
			ans+= s.charAt(i)+"";
		return ans;
	}
}