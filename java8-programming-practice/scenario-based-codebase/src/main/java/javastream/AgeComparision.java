package javastream;
import java.util.*;

public class AgeComparision {
	public static void ageGreaterThan25(int[] arr) {
		
		Arrays.stream(arr).filter(age -> age>25).forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		
		int[] ages = {17, 19,25, 26, 29, 39,40};
		
		ageGreaterThan25(ages);
	}
}
