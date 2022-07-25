package com.regex;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	UserRegistration uspTest;
	String inputs;
	boolean expectedResult;
	
	public UserRegistrationTest(String inputs, boolean expectedResult) {
		this.inputs = inputs;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void classObject() {
		 uspTest = new UserRegistration();
	}
	
	@Parameters(name="given_email_inputs_expected_boolean_outputs()")
	public static Collection given_email_inputs_expected_boolean_outputs() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com" , true},
			{"abc-100@yahoo.com" , true},
			{"abc.100@yahoo.com" , true},
			{"abc111@abc.com" , true},
			{"abc-100@abc.net" , true},
			{"abc.100@abc.com.au" , true},
			{"abc@1.com" , true},
			{"abc@gmail.com.com" , true},
			{"abc+100@gmail.com.com" , true},
			{"abc+100@gmail.com" , true},
			{"abc@.com.com" , false},
			{"abc123@gmail.a" , false},
			{"abc123@.com" , false},
			{"abc123@.com.com" , false},
			{".abc@abc.com" , false},
			{"abc()*@gmail.com" , false},
			{"abc@%*.com" , false},
			{"abc..2002@gmail.com" , false},
			{"abc.@gmail.com" , false},
			{"abc@abc@gmail.com" , false},
			{"abc@gmail.com.1a" , false},
			{"abc@gmail.com.aa.au^$" , false}
		});
	}
	
	@Test
	public void given_parameterized_test_emails_extpected_as_boolean_output() {
		boolean output = uspTest.emailValidation(inputs);
		assertEquals(expectedResult , output);
	}
	
	@Test
	public void given_first_name_expected_as_true() {
		
		boolean output = uspTest.firstNameValidation("Jah");
		assertEquals(true , output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		
		boolean output = uspTest.firstNameValidation("jah");
		assertEquals(false , output);
	}
	
	@Test
	public void given_last_name_expected_as_true() {
		
		boolean output = uspTest.lastNameValidation("Nvi");
		assertEquals(true , output);
	}
	
	@Test
	public void given_last_name_expected_as_false() {
		
		boolean output = uspTest.lastNameValidation("nvi");
		assertEquals(false , output);
	}
	
	@Test
	public void given_email_expected_as_true() {
		
		boolean output = uspTest.emailValidation("jah.nav@co.in");
		assertEquals(true , output);
	}
	
	@Test
	public void given_email_expected_as_false() {
		
		boolean output = uspTest.emailValidation("fgd@gd@.gmail.com");
		assertEquals(false , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_true() {
		
		boolean output = uspTest.mobileValidation("91 8252524782");
		assertEquals(true , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_false() {
		
		boolean output = uspTest.mobileValidation("915252535444");
		assertEquals(false , output);
	}
	
	@Test
	public void given_password_expected_as_true() {
		
		boolean output = uspTest.passwordValidation("Jahnvi123@");
		assertEquals(true , output);
	}
	
	@Test
	public void given_password_expected_as_false() {
		
		boolean output = uspTest.passwordValidation("JaAn$l123@");
		assertEquals(false , output);
	}

}
