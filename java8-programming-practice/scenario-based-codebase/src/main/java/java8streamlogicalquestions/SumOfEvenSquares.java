package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class SumOfEvenSquares {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		Long ans = list.stream().filter(s->s%2==0)
				.collect(Collectors.summarizingInt(s->s*s)).getSum();
		
		System.out.println("Even square sum: "+ans);
	}
}
