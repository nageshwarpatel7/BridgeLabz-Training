package java8streamlogicalquestions;
import java.util.*;

public class CountVowel {
	public static void main(String[] args) {
		String str = "programming";
		
		Long cnt = str.chars().filter(ch->"aeiouAEIOU".indexOf(ch)!=-1).count();
				
		System.out.println("Total vowels: "+cnt);
	}
}
