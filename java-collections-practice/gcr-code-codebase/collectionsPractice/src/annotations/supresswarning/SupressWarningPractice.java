package annotations.supresswarning;

import java.util.*;

public class SupressWarningPractice {
	public static void main(String[] args) {
		
		@SuppressWarnings("unchecked")
		ArrayList arr = new ArrayList<>();
		
		arr.add("Hello");
		arr.add(2);
		arr.add(1.2);
		
		arr.forEach(System.out::println);
	}
}
