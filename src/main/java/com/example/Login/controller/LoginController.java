package com.example.Login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Login.model.Login;
import com.example.Login.service.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/log")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping("/check")
	public String controllerCheck(@RequestParam String username)
	{
		System.out.println(username);
		return service.getUser(username);
	}
	
	@PostMapping("/addUser")
	public String addUSer(@RequestBody Login login)
	{ 
		System.out.println(login);
		return service.addUser(login);
		
	}
	
	@GetMapping("/getUser")
	public Login getUserByUsername(@RequestParam String username)
	{
		System.out.println(username);
		return service.getUserByUsername(username);
	}
	
	@GetMapping("/checkUser")
	public boolean checkUser(@RequestBody Login user)
	{
//		System.out.print(user);
		return service.checkUser(user);
	}
	
	@GetMapping("/getAll")
	public List<Login> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUserByUsername(@RequestParam String username)
	{
		System.out.println("delete "+username);
		return service.deleteUserByUsername(username);
	}
}
