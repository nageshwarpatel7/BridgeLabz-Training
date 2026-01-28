package reflection.basicproblems;

import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfoReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter fully qualified class name: ");
            String className = sc.nextLine();

            Class<?> cls = Class.forName(className);

            System.out.println("\n===== Class Information =====");
            System.out.println("Class Name: " + cls.getName());

            System.out.println("\n--- Constructors ---");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println(c);
            }

            System.out.println("\n--- Fields ---");
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f);
            }

            System.out.println("\n--- Methods ---");
            Method[] methods = cls.getDeclaredMethods();
            for (Method m : methods) {
                System.out.println(m);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found. Please enter a valid class name.");
        }
        sc.close();
    }
}
