package com.gunjan.TechJob.login;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gunjan.TechJob.Job.Jobs;



@Repository("userDao")
public interface UserDao extends JpaRepository<User,Long>{
	
	public User findByEmail(String email);
	
	
	
}