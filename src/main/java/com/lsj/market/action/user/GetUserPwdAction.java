package com.lsj.market.action.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetUserPwdAction extends ActionSupport{
	@Autowired
	private User user;
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int userId=(int) ActionContext.getContext().getSession().get("userId");
		User user=userServiceImpl.queryUserInfo(userId);
		setUser(user);
		System.out.println(getUser().getUserDetail());
		return super.execute();
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
