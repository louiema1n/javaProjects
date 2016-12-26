package com.lm.ms.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lm.ms.domain.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(Integer id) {
		return this.getSqlSession().selectOne("findUserById",id);
	}

}
