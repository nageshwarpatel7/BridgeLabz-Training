package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(5,1,9,3);
		
		List<Integer> reversedSorted = list.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(reversedSorted);
	}
}
