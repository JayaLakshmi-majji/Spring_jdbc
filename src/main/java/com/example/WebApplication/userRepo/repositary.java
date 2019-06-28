/**
 * 
 */

package com.example.WebApplication.userRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.WebApplication.user.Register;

/**
 * 
 * @author jayalakshmi
 * This interface extends JpaRepositary to perform operations on the database
 *
 */
public interface repositary extends JpaRepository<Register, Integer>{
	/**
	 * 
	 * @return List of users
	 * @Query Here query is used for retrieving data from database 
	 */
	
	@Query("select user from Register user")
	List<Register> view();
	

	

}
