package com.example.exception;

public class NoSuchEmployeeExists extends RuntimeException {
	/**
	 * 
	 */
	public NoSuchEmployeeExists() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NoSuchEmployeeExists(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NoSuchEmployeeExists(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public NoSuchEmployeeExists(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public NoSuchEmployeeExists(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	private String message;
	
	

}
