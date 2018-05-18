package robsoft.customValidator.validationTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintValidatorContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import robsoft.customValidator.validation.CustomValidator;

@RunWith(MockitoJUnitRunner.class)
public class CustomValidatorTest {

	@InjectMocks
	private CustomValidator validator;
	
	@Mock
	private ConstraintValidatorContext context;
	
	@Test
	public void isValidTest() {
		assertTrue(validator.isValid("Test", context));
	}
	
	@Test
	public void isInvalidTest() {
		assertFalse(validator.isValid("Test2", context));
	}
	
	@Test
	public void isNullTest() {
		assertFalse(validator.isValid(null, context));
	}
}

