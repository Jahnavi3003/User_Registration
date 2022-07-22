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
	
	public static void mobileValidation() {
		System.out.print("Enter Mobile Number :- ");
		String num = input.nextLine();
		
		String numRegex = "^[0-9]{2}(\\s){1}[0-9]{10}$";           
		
		Pattern pattern = Pattern.compile(numRegex);
		
		Matcher matcher = pattern.matcher(num);
		
		System.out.println("Contact pattern matching :- " + matcher.matches());
	}
	
	public static void passwordValidation() {
		System.out.println("Enter a password with 8 minimum characters :- ");
		String password = input.nextLine();
		
		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=[\\w]*[\\W][\\w]*$)(?=.*[a-z]).{8,}$";
		
		Pattern pattern = Pattern.compile(passwordRegex);
		
		Matcher matcher = pattern.matcher(password);
		
		System.out.println("Password Validation :- " + matcher.matches());
	
	} 
	
	
	public static void main(String[] args) {
		
		System.out.println(" WELCOME TO USER REGISTRATION PROGRAM ");
	
		firstNameValidation();
		lastNameValidation();
		emailValidation();
		mobileValidation();
		passwordValidation();
		
}
}
