import java.util.*;

public class CharArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.next();
		
		char[] charArr1 = s.toCharArray();
		char[] charArr2 = generateCharArray(s);
		
		if(charArr1.length != charArr2.length)
			System.out.println("Not Equal character array");
		else{
			for(int i=0;i<charArr1.length;i++){
				if(charArr1[i]!= charArr2[i]){
					System.out.print("Not Equal character array");
					break;
				}
			}
			System.out.println(Arrays.toString(charArr1)+" and "+Arrays.toString(charArr2)+" are equal");				
		}
	}
	public static char[] generateCharArray(String s){
		char[] arr = new char[s.length()];
		
		for(int i=0;i<s.length();i++)
			arr[i] = s.charAt(i);
		return arr;
	}
}