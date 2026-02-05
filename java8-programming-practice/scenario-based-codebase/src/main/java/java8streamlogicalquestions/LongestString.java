package java8streamlogicalquestions;
import java.util.*;

public class LongestString {
	public static void main(String[] args) {
		List<String> list = List.of("java","microservices","api");
		
		list.stream()
		.max(Comparator.comparingInt(s->s.length())).ifPresent(System.out::println);
	}
}
