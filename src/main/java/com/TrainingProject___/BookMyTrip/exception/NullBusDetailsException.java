package com.TrainingProject___.BookMyTrip.exception;





public class NullBusDetailsException extends RuntimeException {

	/**
	 * @param message
	 * @param cause
	 */
	public NullBusDetailsException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public NullBusDetailsException(String message) {
		super(message);
	}
	
}
