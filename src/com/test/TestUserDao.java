package com.test;
import com.DAO.UserDao;
import com.model.User;
public class TestUserDao {

	public static void main(String[] args) {
		
		
		
		
			UserDao userDao=new UserDao();
			
			User user=new User();
			
			
			user.setId(201);
			user.setName("navin");
			user.setUserName("navinkumar");
			
			user.setPassword("root");
			user.setRole("400");
			userDao.update(user);
         
			user.setActive("a");
			  userDao.updatepassword(user);
			
	
		
		
		
				

	}

}
