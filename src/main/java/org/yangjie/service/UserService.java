package org.yangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yangjie.dao.UserDao;
import org.yangjie.entity.User;

@Service // 注册service层spring管理bean
@Transactional // 使用spring事务管理
public class UserService {
	
	@Autowired
	private UserDao userDao;  
	
	/**
	 * 按用户名和密码查询用户
	 * @param username
	 */
	public User get(String username, String password) {
		return userDao.select(username, password);
	}
	
	
}
