package com.example.Practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Practice.entity.User;
import com.example.Practice.model.UserDTO;
import com.example.Practice.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/user")
	public User Save(@RequestBody UserDTO userdto) {
		return userService.Save(userdto);
	}

	@RequestMapping("/userUpdate/{id}")
	public String update(@RequestBody UserDTO userdto, @PathVariable int id) {
		String response = userService.updateUser(userdto, id);
		return response;
	}

}
