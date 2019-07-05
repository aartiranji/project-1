package com.mvc.service;

import java.util.List;
import java.util.Map;

import com.mvc.entity.User;

public interface Login {

	Map<String, Object> registerUser(Map<String, Object> context);

	List<User> getUsers();

	Map<String, Object> getUserByUserNameByPwd(String userName, String password);
	
}
