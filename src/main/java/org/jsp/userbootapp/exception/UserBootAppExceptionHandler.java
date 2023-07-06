package org.jsp.userbootapp.exception;

import org.jsp.userbootapp.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class UserBootAppExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleIdNotFoundException(IdNotFoundException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setBody("user not found");
		structure.setMessage(e.getMessage());
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>> (structure, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(InvalidCredentialException.class)
	public ResponseEntity<ResponseStructure<String>> handleInvalidCredentialException(InvalidCredentialException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setBody("invalid phone / email / password ");
		structure.setMessage(e.getMessage());
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ResponseStructure<String>> (structure, HttpStatus.NOT_FOUND);
	}

}
