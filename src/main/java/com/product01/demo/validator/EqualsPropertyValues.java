package com.product01.demo.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = EqualsPropertyValuesValidator.class)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface EqualsPropertyValues {
	
	public String message() default "{com.product01.demo.validator.EqualsPropertyValues.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};
	
	public String property();
	public String comparingProperty();
	
	@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface List{
		EqualsPropertyValues[] value();
	}
}