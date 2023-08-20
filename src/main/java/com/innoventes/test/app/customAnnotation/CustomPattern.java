package com.innoventes.test.app.customAnnotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyCustomValidator.class)
public @interface CustomPattern {
    String message() default "Invalid pattern";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

