package com.regex;

@FunctionalInterface
public interface IMobileNumValidation {
	public boolean mobileNumberValidation(String mobileNum) throws UserRegistrationException;

}