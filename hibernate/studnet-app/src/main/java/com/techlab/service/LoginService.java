package com.techlab.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.repository.LoginRepository;
@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;
	public boolean checkUser(String name,String password) {
	
		return loginRepository.checkUser(name, password);
	}
}
