/**
 * 
 */
package com.LearnersBuzz.Services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.LearnersBuzz.Beans.Registered_Users;

/**
 * @author 549198
 *
 */
public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	/**
	 * This method is used to authenticate the user and return user details
	 * 
	 * @param fieldName
	 * @param fieldValue
	 * @return List of user
	 */
	public Registered_Users fetchUserByCredentials() {
		Registered_Users user = null;
		Query query = new Query();
		
		List<Registered_Users> employees = mongoTemplate.find(query, Registered_Users.class);
		
		if(employees != null && employees.size()>0){
			String encryptedPassword = employees.get(0).getPassword();
			
			/*if(passwordEncoder.matches(userLogin.getPassword(), encryptedPassword)){
				emp =  mergeEmployeeRecordsforSame(employees);
			}*/
		}
		
		
		
		return user;
	}
}
