package javastream;
import java.util.*;

public class LessThanFifty {
	public static void lessThanFifty(Student[] student) {
		
		Arrays.stream(student).filter(stu -> stu.rank<50).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		Student[] student = { new Student("Nageshwar Prashad Patel",111,"Nageshwar",22,"M","Katni",1,"7447878384"),
				   new Student("Lucky Pal",98,"Lucky",22,"M","Bhopal",2,"8378492379"),
				   new Student("Himesh Kurmi",83,"Himesh",21,"M","Sagar",3,"6524783574"),
				   new Student("xysd iad",78,"xysd",26,"F","hfjksh",53,"6724893471"),
				   new Student("jhsjfy hjs", 67,"jhsjfy",38,"F","hskf",49,"7346274823")};
		
		lessThanFifty(student);
	}
}
