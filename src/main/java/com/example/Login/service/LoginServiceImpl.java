package com.example.Login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login.dao.LoginDao;
import com.example.Login.model.Login;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	
	public LoginDao dao;

	@Override
	public String getUser(String username) {

		return "User Service";
	}

	@Override
	public String addUser(Login user) {
		
		System.out.println("In Service"+user);
		if(dao.findByUsername(user.getUsername()) == null){
			dao.save(user);
			return "User added Successfully";
		}
		else {
		return "Userid already existed, please try with other userid";
		}
	}

	@Override
	public Login getUserByUsername(String username) {
		
		return dao.findByUsername(username);
	}

	@Override
	public String deleteUserByUsername(String username) {
		
		if(dao.findByUsername(username)==null)
		{
			return "User not existed to delete";
		}
		else
		{
			Login logg = dao.findByUsername(username);
			dao.delete(logg);
			return "User deleted";
		}
	}

	@Override
	public List<Login> getAllUsers() {
		
		return dao.findAll();
	}

	@Override
	public boolean checkUser(Login user) {
		if(dao.findByUsername(user.getUsername())!=null)
		{
			
			if(dao.findByUsername(user.getUsername()).getPassword().equals(user.getPassword()))
			{
				
				return true;
			}
			else
				return false;
			
		}
		return false;
	}

	
}
