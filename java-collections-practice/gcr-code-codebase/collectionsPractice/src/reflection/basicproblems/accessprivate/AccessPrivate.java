package reflection.basicproblems.accessprivate;

import java.lang.reflect.*;

public class AccessPrivate {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Person p1  = new Person("Nageshwar", 22);
		
		Class<?> per = p1.getClass();
		
		Field f = per.getDeclaredField("age");
		
		f.setAccessible(true);
		int age = (int) f.get(p1);
		System.out.println("Original age: "+age);
		
		f.set(p1,23);
		
		age = (int) f.getInt(p1);
		
		System.out.println("Modified age: "+age);
	}
}
