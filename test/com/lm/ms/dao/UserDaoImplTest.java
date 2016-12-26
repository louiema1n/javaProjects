package com.lm.ms.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lm.ms.domain.User;

public class UserDaoImplTest {
	private ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("spring/applicationConetxt.xml");
	}
	@Test
	public void testFindUserById() {
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user);
	}

}
