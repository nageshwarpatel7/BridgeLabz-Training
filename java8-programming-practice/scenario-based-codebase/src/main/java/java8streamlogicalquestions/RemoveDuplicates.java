package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,2,3,4,4,5);
		
		List<Integer> ans = list.stream().distinct().toList();
		
		System.out.println(ans);
	}
}
