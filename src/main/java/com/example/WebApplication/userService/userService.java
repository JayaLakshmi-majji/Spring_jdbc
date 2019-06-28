/**
 * 
 */
package com.example.WebApplication.userService;

import java.util.List;

import com.example.WebApplication.user.Register;

/**
 * 
 * @author jayalakshmi
 * This is an userService interface 
 */
public interface userService {
	/**
	 * 
	 * @return List<Register>
	 * This is implemented in userService implementation class
	 */
	List<Register> show();
}
