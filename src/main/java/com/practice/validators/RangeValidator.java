package com.practice.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RangeValidator implements ConstraintValidator<Range, Integer>{

	private int min;
	private int max;
	@Override
	public void initialize(Range constraintAnnotation) {
		min = constraintAnnotation.min();
		max = constraintAnnotation.max();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	@Override
	public boolean isValid(Integer arg0, ConstraintValidatorContext arg1) {
		
		 return arg0==null || (arg0 >= min && arg0 <= max);
	}

}
