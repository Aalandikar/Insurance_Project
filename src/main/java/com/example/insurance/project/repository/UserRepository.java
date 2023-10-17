package com.example.insurance.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.insurance.project.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable>   {
	
	//public User findById(Integer userId);
	

}
