package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		List<String> list = List.of("java","api");
		
		List<String> reversedString =  list.stream().map(s->new StringBuilder(s).reverse().toString())
				.collect(Collectors.toList());
		System.out.println(reversedString);
	}
}
