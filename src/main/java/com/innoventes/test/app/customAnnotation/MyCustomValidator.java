package com.innoventes.test.app.customAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomValidator implements ConstraintValidator<CustomPattern, String> {

    @Override
    public void initialize(CustomPattern constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value==null){
            return true;
        }

        if (value.length() != 5) {
            System.out.println("1");
            return false;
        }

        if (!Character.isUpperCase(value.charAt(0)) || !Character.isUpperCase(value.charAt(1))) {
            System.out.println("2");
            return false;
        }

        if (!Character.isDigit(value.charAt(2)) || !Character.isDigit(value.charAt(3))) {
            System.out.println("3");
            return false;
        }

        char fifthChar = value.charAt(4);
        return fifthChar == 'E' || fifthChar == 'N';
    }
}

