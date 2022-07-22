package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	static Scanner input = new Scanner(System.in);

	
	public static void firstNameValidation() {
		System.out.print("Enter First Name :- ");
		String first_name = input.nextLine();
		
		String firstNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		Matcher matcher = pattern.matcher(first_name);
		
		System.out.println("First name pattern matching :- " + matcher.matches());
	}
	
	public static void lastNameValidation() {
		System.out.print("Enter Last Name :- ");
		String last_name = input.nextLine();
		
		String lastNameRegex = "^[A-Z][A-Z a-z]*$";           
		
		Pattern pattern = Pattern.compile(lastNameRegex);
		
		Matcher matcher = pattern.matcher(last_name);
		
		System.out.println("Last name pattern matching :- " + matcher.matches());
	}
	
	public static void emailValidation() {
		System.out.print("Enter Email :- ");
		String mail = input.nextLine();
		
		String mailRegex = "^[a-z]*(.)[a-z]*(.)@[a-z]*(.)[a-z]*$";           
		
		Pattern pattern = Pattern.compile(mailRegex);
		
		Matcher matcher = pattern.matcher(mail);
		
		System.out.println("Email pattern matching :- " + matcher.matches());
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(" WELCOME TO USER REGISTRATION PROGRAM ");
	
		firstNameValidation();
		lastNameValidation();
		emailValidation();
		
}
}
