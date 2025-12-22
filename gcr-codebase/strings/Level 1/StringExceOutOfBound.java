import java.util.*;

public class StringExceOutOfBound{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			customException();
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception found: "+e.toString());
		}
	}
	public static void customException() throws StringIndexOutOfBoundsException{
		String s = "Lucky";
		System.out.println(s.charAt(s.length()));
	}
}