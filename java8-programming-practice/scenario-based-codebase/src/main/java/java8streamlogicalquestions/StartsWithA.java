package java8streamlogicalquestions;
import java.util.*;

public class StartsWithA {
	public static void main(String[] args) {
		List<String> list = List.of("apple","banana","ant","car");
		
		Long cnt = list.stream().map(s->s.startsWith("a")).count();
		
		System.out.println("Total strings starts with 'a': "+cnt);
	}
}
