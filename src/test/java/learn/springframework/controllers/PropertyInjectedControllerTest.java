package learn.springframework.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import learn.springframework.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl(); 
	}

	@Test
	public void testSayHello() {
		assertEquals(GreetingServiceImpl.SAY_HELLO, propertyInjectedController.sayHello());
		
	}

}
