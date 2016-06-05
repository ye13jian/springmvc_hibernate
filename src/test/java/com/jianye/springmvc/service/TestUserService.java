package com.jianye.springmvc.service;

import java.util.Date;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.jianye.springmvc.entity.AcctUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring.xml", 
		"classpath:spring/spring-hibernate.xml"})
public class TestUserService {
	
	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void save() {
		AcctUser acctUser = new AcctUser();
		acctUser.setId(UUID.randomUUID().toString());
		acctUser.setNickName("jianye");
		acctUser.setRegisterTime(new Date());
		acctUser.setTelephone("13696527039");
		String id = userService.save(acctUser);
		System.out.println(id);
		LOGGER.info(JSON.toJSONString(id));
	}
}