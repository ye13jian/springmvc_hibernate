package com.jianye.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianye.springmvc.dao.UserDao;
import com.jianye.springmvc.entity.AcctUser;
import com.jianye.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public AcctUser load(String id) {
		return userDao.load(id);
	}

	@Override
	public AcctUser get(String id) {
		return userDao.get(id);
	}

	@Override
	public List<AcctUser> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persit(AcctUser entity) {
		userDao.persist(entity);
	}

	@Override
	public String save(AcctUser entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(AcctUser entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

}
