package com.regex;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration uspTest;
	
	
	@Before
	public void classObject() {
		 uspTest = new UserRegistration();
	}
	
	
	@Test
	public void given_first_name_expected_as_true() throws UserRegistrationException {
		
		boolean output = uspTest.firstNameValidation("Jah");
		assertEquals(true , output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		try {
		
		boolean output = uspTest.firstNameValidation("jah");
		assertEquals(false , output);
		}
		catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void given_last_name_expected_as_true() throws UserRegistrationException {
		
		boolean output = uspTest.lastNameValidation("Nvi");
		assertEquals(true , output);
	}
	
	@Test
	public void given_last_name_expected_as_false() {
		try {
		
		boolean output = uspTest.lastNameValidation("nvi");
		assertEquals(false , output);
	}
	catch (UserRegistrationException ex) {
		ex.printStackTrace();
	}
}
	
	@Test
	public void given_email_expected_as_true() throws UserRegistrationException {
		
		boolean output = uspTest.emailValidation("jah.nav@co.in");
		assertEquals(true , output);
	}
	
	@Test
	public void given_email_expected_as_false() {
		try {
		boolean output = uspTest.emailValidation("fgd@gd@.gmail.com");
		assertEquals(false , output);
		}
		catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void given_mobile_number_expected_as_true() throws UserRegistrationException {
		
		boolean output = uspTest.mobileValidation("91 8252524782");
		assertEquals(true , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_false() {
		try {
		boolean output = uspTest.mobileValidation("915252535444");
		assertEquals(false , output);
		}
		catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
	
	@Test
	public void given_password_expected_as_true() throws UserRegistrationException {
		
		boolean output = uspTest.passwordValidation("Jahnvi123@");
		assertEquals(true , output);
	}
	
	@Test
	public void given_password_expected_as_false() {
		try {
		boolean output = uspTest.passwordValidation("JaAn$l123@");
		assertEquals(false , output);
		}
		catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

}
