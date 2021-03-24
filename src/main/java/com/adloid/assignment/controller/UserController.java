package com.adloid.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.adloid.assignment.model.User;
import com.adloid.assignment.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ResponseEntity<List<User>> fetchAllUser() {
		List<User> users;
		users = userService.fetchAllUser();
		return ResponseEntity.ok(users);
	}

	@GetMapping("/user/{email}")
	public ResponseEntity<User> fetchUserByEmail(@PathVariable("email") String email) {
		User user = userService.fetchUserByEmail(email);
		return ResponseEntity.ok(user);
	}

	@PostMapping("/user")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		boolean result = userService.saveUser(user);
		if (result)
			return ResponseEntity.ok("User Created Successfully!!");
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

}