package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class FindStringLength {
	public static void main(String[] args) {
		List<String> list = List.of("cat","elephant","dog");
		
		List<Integer> stringLength = list.stream()
				.map(String::length).collect(Collectors.toList());
		
		System.out.println(stringLength);
	}
}
