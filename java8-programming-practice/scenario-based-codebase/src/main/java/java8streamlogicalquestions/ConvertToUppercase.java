package java8streamlogicalquestions;
import java.util.*;
import java.util.stream.Collectors;

public class ConvertToUppercase {
	public static void main(String[] args) {
		List<String> list = List.of("java","spring","boot");
		
		List<String> upperCaseString = list.stream()
						.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCaseString);
	}
}
