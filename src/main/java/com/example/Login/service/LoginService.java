package com.example.Login.service;
import java.util.List;

import com.example.Login.model.Login;


public interface LoginService {
	String getUser(String username);
	String addUser(Login user);
	Login getUserByUsername(String username);
	String deleteUserByUsername(String username);
	List<Login> getAllUsers();
	boolean checkUser(Login user);
}
