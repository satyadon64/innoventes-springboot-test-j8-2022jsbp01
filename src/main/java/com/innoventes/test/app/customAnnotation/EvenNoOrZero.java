package com.innoventes.test.app.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EvenNoOrZeroValidator.class)
public @interface EvenNoOrZero {
    String message() default "Value must be an even number or zero";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
