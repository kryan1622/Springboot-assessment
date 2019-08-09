package com.bae.rest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bae.entities.Users;
import com.bae.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoTest {

	@InjectMocks
	private Controller controller;
	
	@Mock
	private UserServiceImpl service;
	

	@Mock
	private RestTemplate rest;
	
	@Mock
	private JmsTemplate jmsTemplate;
	
	private static final Users USER_1 = new Users(2L, "251", "Josh");

	
	@Test
	public void createUserTest() {
		Mockito.when(service.createUser(USER_1)).thenReturn(USER_1);
		assertEquals(USER_1, controller.createUser(USER_1));
		Mockito.verify(service).createUser(USER_1);
	}
	
	

}
