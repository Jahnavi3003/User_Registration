package com.regex;

@FunctionalInterface
public interface IFirstNameValidation {
	public boolean firstNameValidation(String first_name) throws UserRegistrationException;
}