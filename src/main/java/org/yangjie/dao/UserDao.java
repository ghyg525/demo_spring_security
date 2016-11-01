package org.yangjie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yangjie.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	// 方法名自动匹配
	User getByUsername(String username);
	
}
