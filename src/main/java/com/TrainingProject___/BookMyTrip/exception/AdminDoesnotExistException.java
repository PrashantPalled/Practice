package com.TrainingProject___.BookMyTrip.exception;



public class AdminDoesnotExistException extends RuntimeException {

	public AdminDoesnotExistException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public AdminDoesnotExistException(String message) {
		super(message);

	}

}
