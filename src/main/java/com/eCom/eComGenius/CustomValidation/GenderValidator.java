package com.eCom.eComGenius.CustomValidation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<ValidateGender,String> {
    private final List<String> validGenders = Arrays.asList("male", "female");
    @Override
    public boolean isValid(String gender, ConstraintValidatorContext constraintValidatorContext) {
        return validGenders.contains(gender);
    }
}
