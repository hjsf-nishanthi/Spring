package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.ed1aspringbootspringdatajpaoraclecrud.entity.User;

public interface UserService {
List<User> getAllUsers();

User addUser(User user);
Optional<User> getUserById(int id);
User updateUser(User user);
void deleteUserById(int id);
void deleteAllUsers();

}
