package com.example.Practice;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Practice.entity.User;
import com.example.Practice.repo.UserRepository;

@SpringBootTest
class PracticeApplicationTests {
	
	@Autowired
	   private UserRepository userRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void Save() {
		User user= new User();
		user.setUsername("Test");
		user.setPassword("Test");
		user.setEmail("test@testmail.com");
		user.setAge("30");
		userRepo.save(user);
			
					
		
		
		
		
		
	}
	
	
}
