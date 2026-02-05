package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class TotalSum {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		Long ans = list.stream().collect(Collectors.summarizingInt(s->s)).getSum();
		
		System.out.println("Sum of all numbers: "+ans);
	}
}
