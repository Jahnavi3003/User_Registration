package com.regex;

@FunctionalInterface
public interface IEmailValidation {
	public boolean emailValidation(String email) throws UserRegistrationException;

}