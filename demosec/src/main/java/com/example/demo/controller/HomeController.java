package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.impl.UserServiceImpl;
import com.example.demo.model.UserDetailes;

@RestController
public class HomeController {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping("/getuser")
	public ResponseEntity<UserDetailes> getUSer() {

		return userServiceImpl.getUser();
	}

	@RequestMapping("/setuser")
	public ResponseEntity<UserDetailes> setUser(@RequestBody UserDetailes userDetailes) {

		return userServiceImpl.setUser(userDetailes);
	}
}
