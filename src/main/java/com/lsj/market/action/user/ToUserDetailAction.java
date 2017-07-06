package com.lsj.market.action.user;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ToUserDetailAction extends ActionSupport{
	
	@Autowired
	private User user;
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		User tempUser=userServiceImpl.queryUserInfo(user.getId());
		if (tempUser.getRole()==1) {
			return "customer";
		}else if(tempUser.getRole()==0){
			return "rootter";
		}else {
			return ERROR;
		}
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	
}
