package robsoft.customValidator.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import robsoft.customValidator.model.CVModel;


@RestController
@RequestMapping("/validation")
public class Controller {

	
	@PostMapping
	public ResponseEntity<String> validation(@Valid @RequestBody CVModel model, BindingResult result) {
		System.out.println(model.getName());
		if(result.hasErrors()) {
			return new ResponseEntity<String>("Validation Error", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
	
}
