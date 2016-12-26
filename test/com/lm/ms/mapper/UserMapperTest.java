package com.lm.ms.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.ms.dao.UserDao;
import com.lm.ms.domain.User;

public class UserMapperTest {
	
	private ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("spring/applicationConetxt.xml");
	}
	
	@Test
	public void testFindUserById() {
		UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
		User user = userMapper.findUserById(2);
		System.out.println(user);
	}

}
