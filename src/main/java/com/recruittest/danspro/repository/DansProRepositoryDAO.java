/*
 * PT Dans Multi Pro - Java Developer Test
 * 
 * Candidate: Falah Wijaya
 * */
package com.recruittest.danspro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.recruittest.danspro.model.DansProUser;

@Repository
public interface DansProRepositoryDAO extends JpaRepository<DansProUser, Integer>{

//	@Query(value = "SELECT username, password FROM danspro_login WHERE username=")
//	List<DansProUser> userlogin();
	List<DansProUser> findByUserName(String userName);
}
