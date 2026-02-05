package java8streamlogicalquestions;
import java.util.*;

public class SecondHighest {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,40,30,20);
		
		list.stream().sorted(Comparator.reverseOrder()).skip(1)
		.findFirst().ifPresent(System.out::println);
	}
}
