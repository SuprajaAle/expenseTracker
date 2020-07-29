package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CheckUserValidation.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface CheckUser {
    public String value() default "#";
    public String message() default "Add # to the username";
    public Class<?> [] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
