package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveEmptyString {
	public static void main(String[] args) {
		List<String> str = List.of("java","","spring","","boot");
		
		List<String> withoutEmptyStr = str.stream()
				.filter(s->s.length()>0).collect(Collectors.toList());
		
		System.out.println(withoutEmptyStr);
	}
}
