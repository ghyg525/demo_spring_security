package org.yangjie.service;

import org.junit.Test;
import org.yangjie.util.SpringUtil;

public class UserServiceTest {

	private static UserService userService = SpringUtil.getBean("userService", UserService.class);
	
	
	@Test
	public void testGet() {
		userService.get("1", "1");
	}
	
}
