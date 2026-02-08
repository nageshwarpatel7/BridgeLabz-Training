package reflection.advancedproblems.methodTiming;

import java.lang.reflect.Method;

public class MethodTimer {

    public static void measureExecutionTime(Object obj) {

        Class<?> cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            try {
                method.setAccessible(true);

                long start = System.nanoTime();

                method.invoke(obj);

                long end = System.nanoTime();

                System.out.println(
                    "Method: " + method.getName() +
                    " | Execution Time: " + (end - start) + " ns"
                );

            } catch (Exception e) {
                System.out.println("Could not execute method: " + method.getName());
            }
        }
    }
}