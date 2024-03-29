package com.bae.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entities.Users;
import com.bae.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoTest {
	
	@InjectMocks
	UserServiceImpl service;
	
	@Mock
	UserRepository repository;
	
	private static final Users USER_1 = new Users(2L, "251", "Josh");
	
	@Test
	public void createUserTest() {
		Mockito.when(repository.save(USER_1)).thenReturn(USER_1);
		assertEquals(USER_1, service.createUser(USER_1));
		Mockito.verify(repository).save(USER_1);
	}

}
