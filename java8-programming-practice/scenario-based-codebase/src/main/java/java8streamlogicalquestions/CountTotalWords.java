package java8streamlogicalquestions;
import java.util.*;

public class CountTotalWords {
	public static void main(String[] args) {
		
		String str = "Java is very powerful";
		
	Long cnt = Arrays.stream(str.split("\\s+")).count();
	
	System.out.println("Total words: "+cnt);
	}
}
