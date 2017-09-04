package com.devops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devops.model.Credential;
import com.devops.service.LoginService;
import com.devops.util.CustomErrorType;

@CrossOrigin()
@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody Credential loginReq) {
    	    	if(loginReq.getEmail().isEmpty() || loginReq.getPass().isEmpty()) {
	    		return new ResponseEntity(new CustomErrorType("M1001", "Please check your email and password"), HttpStatus.NOT_FOUND);
	    	}else{
	    		return new ResponseEntity("Login Success", HttpStatus.OK);	
	    	}
	}
    
    public boolean validateCredential(Credential credential, Credential loginReq) {
    		if(credential == null) {
    			return false;
    		}
    		return (loginReq.getEmail().equals(credential.getEmail()) && loginReq.getPass().equals(credential.getPass()));
    }
}