package com.bae.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entities.Users;
import com.bae.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoTest {

	@InjectMocks
	private Controller controller;
	
	@Mock
	private UserServiceImpl service;
	
	private static final Users USER_1 = new Users(2L, "251", "Josh");

	
	@Test
	public void createUserTest() {
		Mockito.when(service.createUser(USER_1)).thenReturn(USER_1);
		assertEquals(USER_1, controller.createUser(USER_1));
		Mockito.verify(service).createUser(USER_1);
	}
}
