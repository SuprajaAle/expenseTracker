package com.example.demo.validation;

import com.example.demo.validation.CheckUser;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckUserValidation implements ConstraintValidator<CheckUser, String> {


    private String prefix;
    public void initialize(CheckUser user) {
        prefix=user.value();
    }

    @Override
    public boolean isValid(String obj, ConstraintValidatorContext context) {
        boolean result = false;

        if (obj != null) {
            result=obj.startsWith(prefix);
        }

        return result;


    }
}
