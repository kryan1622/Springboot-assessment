package com.bae.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entities.SentUser;
import com.bae.repository.Repository;

@Component
public class Receiver {
	
	@Autowired
	private Repository repo;
	
	@JmsListener(destination ="UserQueue", containerFactory = "myFactory")
	public void recieveMessage(SentUser sentuser) {
		repo.save(sentuser);
	}
	
	

}
