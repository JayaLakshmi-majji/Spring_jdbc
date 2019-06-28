/**
 * 
 */
package com.example.WebApplication.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author jayalakshmi
 * This is an entity class whose properties are used for creating a table
 * id is the primary key 
 */
@Entity
public class Register {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 /**
	  * variable id is of type integer and used to store the id of a user
	  */
	 public int id;
	 /**
	  * variable name is of type string and used to store user's name
	  */
	 public String name;
	 /**
	  * Variable phnNo is of type String and stores user's phone Number
	  */
	 public String phnNo;
	 /**
	  * Variable place is of type String and is used to store place of user
	  */
	 public String place;	
}
