package java8streamlogicalquestions;
import java.util.*;

public class GetMaxValue {
	public static void main(String[] args) {
		List<Integer> list = List.of(10,25,3,99,45);
		
		list.stream().max(Comparator.comparingInt(s->s)).ifPresent(System.out::println);
	}
}
