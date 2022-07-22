package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static boolean firstNameValidation(String first_name) {
		
		String firstNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		return matcher.matches();
	}
	
	public static boolean lastNameValidation(String last_name) {
		
		
		String lastNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		return matcher.matches();
	}
	
	public static boolean emailValidation(String mail) {
		
		String mailRegex = "^[a-z]*(.)[a-z]*(.)@[a-z]*(.)[a-z]*$";           
		
		Pattern pattern = Pattern.compile(mailRegex);
		
		Matcher matcher = pattern.matcher(mail);
		
		return matcher.matches();
	}
	
	public static boolean mobileValidation(String num) {
		
		String numRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";           
		
		Pattern pattern = Pattern.compile(numRegex);
		
		Matcher matcher = pattern.matcher(num);
		
		return matcher.matches();
	}
	
	public static boolean passwordValidation(String password) {
		
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
		return matcher.matches();
	
}
}
