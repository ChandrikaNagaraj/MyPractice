package com.example.Practice.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Practice.entity.User;
import com.example.Practice.model.UserDTO;
import com.example.Practice.repo.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepo;

	public User Save(UserDTO userDTO) {

		User userEntity = new User();
		BeanUtils.copyProperties(userDTO, userEntity);
		return userRepo.save(userEntity);

	}

	public String updateUser(UserDTO userDTO, int id) {
		return userRepo.findById(id).map(xmap -> {
			xmap.setUsername(userDTO.getUsername());
			xmap.setEmail(userDTO.getEmail());
			userRepo.save(xmap);
			return "This customer exists";
		}).orElseGet(() -> {
			return "This customer doesn't exist";
		});

	}

}
