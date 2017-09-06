package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository usr;

	public List<User> findAll() {
		return (List<User>) usr.findAll();
	}

	public User save(User user) {
		User u = usr.save(user);
		return u;
	}

	public void delete(Long id) {
		usr.delete(id);		
	}
}
