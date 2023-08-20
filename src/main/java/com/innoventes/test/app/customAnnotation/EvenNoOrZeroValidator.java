package com.innoventes.test.app.customAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNoOrZeroValidator implements ConstraintValidator<EvenNoOrZero, Integer> {
    @Override
    public void initialize(EvenNoOrZero constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {

        return  value == null || value == 0 || (value % 2 == 0);
    }


}
