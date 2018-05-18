# How To Write Custom Validator In Spring Boot

Step by Step:
- Add @Valid Annotation and BindingResult as a Parameter -> public void foo(@Valid User user, BindingResult result)
- Create a Constraint(Custom Annotation)/Validator Class 
- Add Custom Annotation in Entity/DTO (Field, Method etc.)
- Check for result.hasErrors() and return error response 
