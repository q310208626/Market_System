package com.lsj.market.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.dao.impl.UserDaoImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserRegistAction extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	private User user;
	@Autowired
	private UserDetail userDetail;
	
	private ApplicationContext context;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int result=0;
		user.setUserDetail(userDetail);
		result=(Integer)userServiceImpl.registService(user);
		if(result>0){
			return "success";
		}
		return "error";
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	
}
