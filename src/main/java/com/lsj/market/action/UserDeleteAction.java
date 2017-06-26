package com.lsj.market.action;

import javax.persistence.CascadeType;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteAction extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private User user;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub		
		try{
			userServiceImpl.deleteService(user);
			return super.execute();
		}catch(Exception e){
			return ERROR;
		}
		
		
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
	
	
	

}
