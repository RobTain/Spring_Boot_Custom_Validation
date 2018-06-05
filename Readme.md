# How To Write Custom Validator In Spring Boot

Step by Step:
- Controller: Add @Valid Annotation and BindingResult as a Parameter 
-> public ResponseEntity<User> foo(@Valid User user, BindingResult result)
- Create a Constraint(Custom Annotation)/Validator Class 
- Add Custom Annotation in Entity/DTO (Field, Method etc.)
- Check for result.hasErrors() and return error response 
