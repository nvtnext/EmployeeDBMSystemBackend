package org.jsp.userbootapp.exception;

public class InvalidCredentialException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Invalid Credential";
	}

}
