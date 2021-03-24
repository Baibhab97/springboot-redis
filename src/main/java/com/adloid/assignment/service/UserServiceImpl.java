package com.adloid.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adloid.assignment.dao.UserDao;
import com.adloid.assignment.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean saveUser(User user) {
		User existing = fetchUserByEmail(user.getEmail());
		if(existing != null) {
			return false;
		}
		return userDao.saveUser(user);
	}

	@Override
	public List<User> fetchAllUser() {
		return userDao.fetchAllUser();
	}

	@Override
	public User fetchUserByEmail(String email) {
		return userDao.fetchUserByEmail(email);
	}

	
}
