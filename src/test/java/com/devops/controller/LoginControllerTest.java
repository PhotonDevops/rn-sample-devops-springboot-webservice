package com.devops.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devops.model.Credential;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {
	@Autowired
	LoginController loginController;
	
	@Test
	public void testValidateCredentialSuccess() {
		Credential credential = new Credential("devops@photon.com", "1234");
		Credential loginReq = new Credential("devops@photon.com", "1234");
		assertTrue(loginController.validateCredential(credential, loginReq));
	}

}
