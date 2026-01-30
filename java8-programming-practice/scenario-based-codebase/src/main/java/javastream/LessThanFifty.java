package javastream;
import java.util.*;

public class LessThanFifty {
	public static void lessThanFifty(int[] arr) {
		
		Arrays.stream(arr).filter(n -> n<50).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		
		lessThanFifty(arr);
	}
}
