package reflection.intermediateproblem.modifystaticfield;

import java.lang.reflect.Field;

public class ReflectionDemo {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName(
                "reflection.intermediateproblem.modifystaticfield.Configuration"
            );

            Field field = cls.getDeclaredField("API_KEY");

            field.setAccessible(true);

            field.set(null, "NEW_API_KEY_123");

            Configuration.printKey();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}