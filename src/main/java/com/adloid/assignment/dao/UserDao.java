package com.adloid.assignment.dao;

import java.util.List;

import com.adloid.assignment.model.User;

public interface UserDao {

	boolean saveUser(User user);

	List<User> fetchAllUser();

	User fetchUserByEmail(String email);

}
