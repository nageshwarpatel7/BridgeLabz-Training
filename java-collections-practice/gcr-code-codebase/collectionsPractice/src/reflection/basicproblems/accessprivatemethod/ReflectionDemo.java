package reflection.basicproblems.accessprivatemethod;

import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();

            Class<?> cls = calculator.getClass();

            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            method.setAccessible(true);

            Object result = method.invoke(calculator, 5, 4);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
