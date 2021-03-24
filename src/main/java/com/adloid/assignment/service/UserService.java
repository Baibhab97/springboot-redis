package com.adloid.assignment.service;

import java.util.List;

import com.adloid.assignment.model.User;

public interface UserService {

	boolean saveUser(User user);

	List<User> fetchAllUser();

	User fetchUserByEmail(String email);

}
