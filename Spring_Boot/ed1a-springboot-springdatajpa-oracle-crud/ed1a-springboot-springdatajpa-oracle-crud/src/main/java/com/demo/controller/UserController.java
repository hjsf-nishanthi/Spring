package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ed1aspringbootspringdatajpaoraclecrud.entity.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		System.out.println("00----------------------");
		return this.userService.getAllUsers();
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void addUser(@RequestBody User user) {
		this.userService.addUser(user);
	}

	@RequestMapping(value = "/updateuser", method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}

	public Optional<User> getUser(int id) {
		return this.userService.getUserById(id);
	}

	public void deleteAllUsers() {
		this.userService.deleteAllUsers();
	}

	public void deleteUser(int id) {
		this.userService.deleteUserById(id);
	}
}
