package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class NumberGreaterThan50 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,55,60,23,90);
		
		List<Integer>ans = list.stream().filter(s->s>50).collect(Collectors.toList());
		System.out.println(ans);
	}
}
