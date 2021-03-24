package com.adloid.assignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.adloid.assignment.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private RedisTemplate redisTemplate;

	private static final String KEY = "USER";

	@Override
	public boolean saveUser(User user) {
		try {
			redisTemplate.opsForHash().put(KEY, user.getEmail(), user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<User> fetchAllUser() {
		List<User> users;
		users = redisTemplate.opsForHash().values(KEY);
		return users;
	}

	@Override
	public User fetchUserByEmail(String email) {
		User user;
		user = (User) redisTemplate.opsForHash().get(KEY, email);
		return user;
	}

}
