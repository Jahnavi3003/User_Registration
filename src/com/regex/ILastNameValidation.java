package com.regex;

@FunctionalInterface
public interface ILastNameValidation {
	public boolean lastNameValidation(String last_name) throws UserRegistrationException;

}
