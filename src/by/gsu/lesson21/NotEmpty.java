package by.gsu.lesson21;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
//@ValidatedBy(value = NotEmptyValidator.class)
public @interface NotEmpty {
    boolean value() default true;
}
