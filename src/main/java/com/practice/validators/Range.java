package com.practice.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=RangeValidator.class)
public @interface Range {
	 String message() default "Value is not within the range";
	 Class<?>[] groups() default {};
	 
	 Class<? extends Payload>[] payload() default {};
	 
	 int min() default Integer.MIN_VALUE;
	 
	 int max() default Integer.MAX_VALUE;
}
