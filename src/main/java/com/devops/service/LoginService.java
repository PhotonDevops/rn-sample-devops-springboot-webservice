package com.devops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.model.Credential;
import com.devops.repository.CredentialRepository;

@Service("loginService")
public class LoginService{
	
	@Autowired
	CredentialRepository credentialRepository;
	
	public Credential getCredentialByEmail(String email) {
		return credentialRepository.findOne(email);
	}
}
