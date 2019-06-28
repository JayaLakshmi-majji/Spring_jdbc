package com.example.WebApplication.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebApplication.user.Register;
import com.example.WebApplication.userRepo.repositary;

/**
 * @author jayalakshmi
 *
 */
@Service("user")
public class UserServicesImpl implements userService{

	/**
	 * 
	 */
	@Autowired
	repositary rep;
	/**
	 * Implemented from userService interface and used for retrieving data
	 */
	@Override
	public List<Register> show() {
		
		return rep.view();
		
	}
	/**
	 * @param reg
	 * Takes reg object of type Register as parameter
	 */
	public void push(final Register reg) {
		rep.save(reg);
		
	}

}
