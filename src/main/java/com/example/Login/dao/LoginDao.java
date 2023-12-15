package com.example.Login.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Login.model.Login;

@Repository
public interface LoginDao extends JpaRepository<Login, Integer>{

		  Login findByUsername(String username);
		
}
