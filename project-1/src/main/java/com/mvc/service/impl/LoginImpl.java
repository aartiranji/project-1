package com.mvc.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.controller.LoginController;
import com.mvc.entity.User;
import com.mvc.exception.GenericException;
import com.mvc.repository.UserRepository;
import com.mvc.service.Login;

@Service
public class LoginImpl implements Login {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public Map<String, Object> registerUser(Map<String, Object> context) {
		LOGGER.info("inside LoginImpl.registerUser(Map<String, Object> context) method");
		String userName = (String) context.get("userName");
		String password = (String) context.get("password");
		String phoneNo = (String) context.get("phoneNo");
		if (Objects.isNull(userName) || "".equals(userName)) {
		}
		if (Objects.isNull(password) || "".equals(password)) {
		}
		if (Objects.isNull(phoneNo) || "".equals(phoneNo)) {
		}

		User userExist = userRepository.findByUserName(userName);
		if (Objects.nonNull(userExist)) {
		}
		User userExist2 = userRepository.findByPhoneNo(phoneNo);
		if (Objects.nonNull(userExist2)) {
		}

		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setPhoneNo(phoneNo);
		userRepository.save(user);
		return context;
	}

	@Override
	public List<User> getUsers() {
		LOGGER.info("inside LoginImpl.getUsers() method");

		return userRepository.findAll();
	}

	@Override
	public Map<String, Object> getUserByUserNameByPwd(String userName, String password) {
		LOGGER.info("inside LoginImpl.getUsers() method");

		User user = userRepository.findByUserName(userName);
		if (Objects.isNull(user)) {
			throw new GenericException("User name not exist");
		}
		Map<String, Object> user2 = userRepository.findByUserNameByPassword(userName, password);
		if (Objects.isNull(user2) || user2.isEmpty()) {
			throw new GenericException("User password is wrong");
		}
		
		return user2;
	}

}
