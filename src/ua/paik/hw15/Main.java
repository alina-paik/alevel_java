package ua.paik.hw15;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            A instance = createInstance(A.class);
            System.out.println("Original object: " + instance);
            setPrivateFieldValue(instance, "id", "456");
            setPrivateFieldValue(instance, "name", "B");
            System.out.println("Modified object: " + instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static <T> T createInstance(Class<T> clazz) throws Exception {
        java.lang.reflect.Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

    private static void setPrivateFieldValue(Object object, String fieldName, Object newValue) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);

        try {
            field.set(object, newValue);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}


