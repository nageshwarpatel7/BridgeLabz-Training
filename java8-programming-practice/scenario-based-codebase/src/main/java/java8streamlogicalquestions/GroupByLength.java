package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByLength {
	public static void main(String[] args) {
		
		List<String> list = List.of("a","bb","ccc","dd");
		
		Map<Integer, List<String>> ans = list.stream()
										.collect(Collectors.groupingBy(s->s.length(),Collectors.toList()));
		
		System.out.println(ans);
	}
}
