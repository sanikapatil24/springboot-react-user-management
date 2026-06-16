package com.sit.exception;


public class UserNotFoundException extends RuntimeException{
	
	public UserNotFoundException(long id)
	{
		super("User Not Found: "+id);
	}
	

}
