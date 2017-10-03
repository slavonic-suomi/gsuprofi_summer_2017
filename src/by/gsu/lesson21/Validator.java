package by.gsu.lesson21;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Validator {
    public static void validate(Object o) {
        Class<?> cls = o.getClass();
        List<Field> fields = getAllFields(cls);

        List<Field> annotatedFields = fields
                .stream()
                .filter(f -> f.getAnnotation(NotEmpty.class) != null)
                .collect(Collectors.toList());

        for (Field field : annotatedFields) {
            NotEmpty empty = field.getAnnotation(NotEmpty.class);
            validateSingleProperty(field, o, empty.failFast());
        }



    }

    private static void validateSingleProperty(Field field, Object o,
                                               boolean failFast) {
        try {
            field.setAccessible(true);
            Object value = field.get(o);
            String fieldName = field.getName();

            if (value == null) {
                throw new ValidationException(fieldName);
            }

            Class<?> type = field.getType();
            if (type.isPrimitive()) {
                throw new IllegalStateException();
            }
            if (type.isArray()) {
                Object[] objects = (Object[]) value;
                if (objects.length == 0) {
                    throw new ValidationException(fieldName);
                }
            }
            if (value instanceof Collection) {
                Collection objects = (Collection) value;
                if (objects.size() == 0) {
                    if (failFast) {
                        throw new ValidationException(fieldName);
                    } else {
                        //add to error list some info
                    }
                }
            }
            if (value instanceof CharSequence) {
                CharSequence cs = (CharSequence) value;
                if (cs.length() == 0) {
                    throw new ValidationException(fieldName);

                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }

    private static List<Field> getAllFields(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        List<Field> result = new ArrayList<>(fields.length);
        result.addAll(Arrays.asList(fields));

        Class<?> superclass = cls.getSuperclass();
        if (!superclass.equals(Object.class)) {
            List<Field> superFields = getAllFields(superclass);
            result.addAll(superFields);
        }

        return result;
    }
}
