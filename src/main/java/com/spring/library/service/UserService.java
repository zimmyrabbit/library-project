package com.spring.library.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.library.dao.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public int joinUser(Map<String, String> args) {
		return userDao.joinUser(args);
	}	
	
	public String userJoinIdCheck(String id) {
		return userDao.userJoinIdCheck(id);
	}
	
	public Map<String, String> userLogin(Map<String, String> args) {
		return userDao.userLogin(args);
	}
}