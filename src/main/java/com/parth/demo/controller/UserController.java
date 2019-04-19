package com.parth.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parth.demo.Dao.User;
import com.parth.demo.Dao.UserDao;

import lombok.NonNull;

@RestController
public class UserController {

	@Autowired
	UserDao userDao;
	
	@GetMapping("/getByEmail")
	public String getNameByEmail(@RequestParam String email) {
		return getName(userDao.findByEmail(email));
	}
	
	private String getName(@NonNull User user) {
		return user.getFirstName();
	}
}
