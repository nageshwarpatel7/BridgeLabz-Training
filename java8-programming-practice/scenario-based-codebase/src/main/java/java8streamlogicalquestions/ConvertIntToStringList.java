package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class ConvertIntToStringList {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3);
		
		List<String> lst1 = list.stream().map(s->s.toString()).collect(Collectors.toList());
		
		System.out.println(lst1);
	}
}
