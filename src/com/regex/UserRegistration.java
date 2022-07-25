package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean firstNameValidation(String first_name) throws UserRegistrationException {
		
		String firstNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_FIRST_NAME + " Please enter a valid input.");
		}
	}
	
	public boolean lastNameValidation(String last_name) throws UserRegistrationException {
		
		
		String lastNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_LAST_NAME + " Please enter a valid input.");
		}
	}
	
	public boolean emailValidation(String mail) throws UserRegistrationException{
		
		String mailRegex = "^[a-z]*(.)[a-z]*(.)@[a-z]*(.)[a-z]*$";           
		
		Pattern pattern = Pattern.compile(mailRegex);
		
		Matcher matcher = pattern.matcher(mail);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_EMAIL + " Please enter a valid input.");
		}
	}
	public boolean mobileValidation(String num) throws UserRegistrationException {
		
		String numRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";           
		
		Pattern pattern = Pattern.compile(numRegex);
		
		Matcher matcher = pattern.matcher(num);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_MOBILE_NUMBER + " Please enter a valid input.");
		}
	}
	
	public boolean passwordValidation(String password) throws UserRegistrationException {
		
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			throw new UserRegistrationException(UserRegistrationException.type_of_exceptions.INVALID_PASSWORD + " Please enter a valid input.");
		}
	
}
}
