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
	
	
	public static void main(String[] args) {
		
		System.out.println(" WELCOME TO USER REGISTRATION PROGRAM ");
	
		firstNameValidation();

	
		
}
}
