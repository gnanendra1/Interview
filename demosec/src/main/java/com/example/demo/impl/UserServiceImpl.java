package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Address;
import com.example.demo.model.UserDetailes;

@Service
public class UserServiceImpl {

	public ResponseEntity<UserDetailes> getUser() {
		
		Address address=new Address();
		address.setPlatNo(145);
		address.setStreetName("mv kandriga");
		List<Address> listAddress=new ArrayList<>();
		listAddress.add(address);
		
		UserDetailes userDetailes=new UserDetailes();
		userDetailes.setuName("Gnana");
		userDetailes.setuPassword("gnanareddy");
		userDetailes.setAddress(listAddress);
		
		return new ResponseEntity<UserDetailes>(userDetailes,HttpStatus.OK);
		
	}
	
	public ResponseEntity<UserDetailes> setUser(UserDetailes userDetailes) {
		System.out.println(userDetailes.getuName());
		System.out.println(userDetailes.getuPassword());
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
