package java8streamlogicalquestions;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
	public static void main(String[] args) {
		
		String str= "banana";
		
	Map<Character, Long> freq = str.chars().mapToObj(s->(char)s)
			.collect(Collectors.groupingBy(s->s,Collectors.counting()));
	
		freq.forEach((c,a)->System.out.println(c+" -> "+a));
	}
}
