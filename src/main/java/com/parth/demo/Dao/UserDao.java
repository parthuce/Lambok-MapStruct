package com.parth.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);

}
