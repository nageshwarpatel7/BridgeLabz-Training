package javastream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ThirdBestRank {
	public static void main(String[] args) {
		List<Student> student = List.of(new Student("Nageshwar Prashad Patel",111,"Nageshwar",22,"M","Katni",1,"7447878384"),
				   new Student("Lucky Pal",98,"Lucky",22,"M","Bhopal",2,"8378492379"),
				   new Student("Himesh Kurmi",83,"Himesh",21,"M","Sagar",3,"6524783574"),
				   new Student("xysd iad",78,"xysd",26,"F","Mumbai",53,"6724893471"),
				   new Student("jhsjfy hjs", 67,"jhsjfy",38,"F","hskf",49,"7346274823"));
		
		student.stream().sorted(Comparator.comparingInt(s->s.rank)).skip(2).findFirst()
		.ifPresent(third -> System.out.println("Student with third rank: "+third));
		
	}
}
