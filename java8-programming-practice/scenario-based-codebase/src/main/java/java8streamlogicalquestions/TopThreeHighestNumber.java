package java8streamlogicalquestions;
import java.util.*;

public class TopThreeHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = List.of(10,90,30,70,50);
		
		list.stream().sorted(Comparator.reverseOrder())
		.limit(3).forEach(System.out::println);
	}
}
