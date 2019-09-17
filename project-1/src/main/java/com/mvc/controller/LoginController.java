package com.mvc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.entity.User;
import com.mvc.service.Login;
import com.mvc.service.impl.LoginImpl;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	Login login = new LoginImpl();

	@RequestMapping(value = "/cd", method = RequestMethod.GET)
	public String index() {
		return "Hello World!!!";
	}

	@RequestMapping("/ab")
	public String index2() {
		return "hello.html";
	}

	@PostMapping("/register")
	public Map<String, Object> register(@RequestBody Map<String, Object> context) {
		return login.registerUser(context);
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return login.getUsers();
	}

	@GetMapping("/user")
	public Map<String, Object> getUserByIdByPwd(@RequestParam(value = "userName", required = true) String userName,
			@RequestParam(value = "password", required = true) String password) {
		
		return login.getUserByUserNameByPwd(userName, password);
	}

}