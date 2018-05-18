package robsoft.customValidator.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import robsoft.customValidator.validation.annotation.CustomAnnotation;

public class CustomValidator implements ConstraintValidator<CustomAnnotation, String>{

	@Override
	public void initialize(CustomAnnotation constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if (value != null) {
			return value.matches("^[a-zA-Z]*$");
		}
		return false;
	}

}
