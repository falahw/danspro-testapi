/*
 * PT Dans Multi Pro - Java Developer Test
 * 
 * Candidate: Falah Wijaya
 * */
package com.recruittest.danspro.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.recruittest.danspro.model.DansProUser;

@RestController
public class DansProResource {

	@Autowired
	DansProRepositoryDAO dprDAO;
	
	//this is API-URL to LIST DATA of ALL USERS
	@GetMapping("users")
	private List<DansProUser> getUsers() {
		// TODO Auto-generated method stub
		List<DansProUser> allUsers = dprDAO.findAll();
		
		return allUsers;
	}
	
	//this is API-URL to LIST DATA of CHOSEN USER
	@GetMapping("user/{username}")
	private List<DansProUser> getUser(@PathVariable String username) {
		// TODO Auto-generated method stub
		return dprDAO.findByUserName(username);
	}
}
