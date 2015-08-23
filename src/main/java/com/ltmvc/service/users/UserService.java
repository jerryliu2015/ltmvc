package com.ltmvc.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltmvc.dao.mybatis.users.UsersDao;
import com.ltmvc.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UsersDao userDao;
	
	public User getUser(int userid){
		return userDao.getUser(userid);
	}
}
