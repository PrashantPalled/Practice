package com.TrainingProject___.BookMyTrip.exception;



public class UserDoesnotExistException extends RuntimeException {

	public UserDoesnotExistException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public UserDoesnotExistException(String message) {
		super(message);
		
	}

	
	
}

