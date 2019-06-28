/**
 * 
 */
package com.example.WebApplication.webController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.WebApplication.user.Register;
import com.example.WebApplication.userService.UserServicesImpl;
/**
 * 
 * @author jayalakshmi
 * This class is a controller class
 *
 */

@RestController
@RequestMapping("/user")
public class WebController {
	/**
	 * 
	 * @return String
	 * 
	 */
	@RequestMapping("/welcome")
	public String welcome() {
		return "hello world";
	}
	
	@Autowired
	UserServicesImpl user;
	@GetMapping(value = "/register")
	/**
	 * This method is to get the list of users in the database
	 * @return List of users
	 */
    public List<Register> show() {
		return user.show();
	}
	
    @PostMapping(value = "/push")
    /**
     * This method is to add values into the database
     * @param reg
     * reg is the object passed to the method of type Register
     */
    public void push(@RequestBody Register reg) {
    	user.push(reg);
    }
	
}
