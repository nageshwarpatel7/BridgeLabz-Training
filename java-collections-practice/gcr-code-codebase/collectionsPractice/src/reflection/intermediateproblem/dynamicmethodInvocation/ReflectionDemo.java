package reflection.intermediateproblem.dynamicmethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = scanner.next();

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            Class<?> cls = Class.forName(
                "reflection.intermediateproblem.dynamicmethodInvocation.MathOperations"
            );

            Object obj = cls.getDeclaredConstructor().newInstance();

            Method method = cls.getMethod(methodName, int.class, int.class);

            Object result = method.invoke(obj, a, b);

            System.out.println("Result: " + result);

            scanner.close();

        } catch (Exception e) {
            System.out.println("Invalid method name or error occurred.");
            e.printStackTrace();
        }
    }
}
