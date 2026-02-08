package reflection.advancedproblems.dependencyInjection;

import java.lang.reflect.Field;

public class DIContainer {

    public static <T> T getInstance(Class<T> clazz) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {

                if (field.isAnnotationPresent(Inject.class)) {

                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType
                            .getDeclaredConstructor()
                            .newInstance();

                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Dependency injection failed", e);
        }
    }
}
