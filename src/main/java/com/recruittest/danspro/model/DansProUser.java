/*
 * PT Dans Multi Pro - Java Developer Test
 * 
 * Candidate: Falah Wijaya
 * */
package com.recruittest.danspro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "danspro_login")
public class DansProUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //set unique id auto generated
	@Column(name = "id")
	private int id;
	@Column(name = "username", unique = true) //set unique constraint for column 'username'
	private String userName;
	@Column(name = "password")
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "DansProUser [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}	
}
