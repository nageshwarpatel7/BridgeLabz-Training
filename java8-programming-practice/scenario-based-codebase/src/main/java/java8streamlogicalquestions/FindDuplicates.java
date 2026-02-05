package java8streamlogicalquestions;

import java.util.ArrayList;
import java.util.*;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> arr = List.of(1,2,3,2,4,5,1);
		
		HashSet<Integer> set = new HashSet<>();
		List<Integer> ans = arr.stream().filter(s->!set.add(s)).toList();
		
		System.out.println(ans);
	}
}
