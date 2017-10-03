package by.gsu.lesson21;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflMain {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        classInfoTest(String.class);
        User user = new User();
        classInfoTest(user.getClass());

        Class<User> userClass = User.class;

        Field id = userClass.getDeclaredField("id");
        id.setAccessible(true);
        Object o = id.get(user);
        System.out.println(o);

        id.set(user, 123L);

        Method getId = userClass.getMethod("getId");
        getId.setAccessible(true);
        Object idTrougthRef = getId.invoke(user);
        System.out.println(idTrougthRef);

        testMethod("qwe", 1,2,3,4,5,6);

    }

    public static void testMethod(String x1, int... ints) {
//        ints.length;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }

    public static void classInfoTest(Class<?> cls) {
        System.out.println(cls.getCanonicalName());

        Field[] publicFields = cls.getFields();
        Field[] declaredFields = cls.getDeclaredFields();

//        System.out.println("public\n");
//        for (Field field : publicFields) {
//            System.out.println(field.getName());
//        }
//
//        System.out.println("\ndeclared");
//        for (Field field : declaredFields) {
//            System.out.println(field.getName());
//        }
        System.out.println("fields:\n");
        for (Field field : getAll(cls)) {
            System.out.println(field.getName());
        }
    }

    public static List<Field> getAll(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        List<Field> result = new ArrayList<>(fields.length);
        result.addAll(Arrays.asList(fields));

        Class<?> superclass = cls.getSuperclass();
        if (!superclass.equals(Object.class)) {
            List<Field> superFields = getAll(superclass);
            result.addAll(superFields);
        }

        return result;
    }
}
