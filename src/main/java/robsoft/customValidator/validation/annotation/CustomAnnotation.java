package robsoft.customValidator.validation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import robsoft.customValidator.validation.CustomValidator;

@Constraint(validatedBy = CustomValidator.class) // which class validate input?
@Target(ElementType.FIELD) // which program element will be validated?
@Retention(RetentionPolicy.RUNTIME) // when is the annotation available for the compiler
public @interface CustomAnnotation  {
	
	String message() default "Error messages in case the constraint is violated";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
