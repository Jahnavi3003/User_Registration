package com.regex;

@FunctionalInterface
public interface IPasswordValidation {
	public boolean passwordValidation(String password) throws UserRegistrationException;

}
