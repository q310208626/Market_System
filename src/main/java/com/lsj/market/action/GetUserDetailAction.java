package com.lsj.market.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetUserDetailAction extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private User user;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		int userId=(int) ActionContext.getContext().getSession().get("userId");
		User user=userServiceImpl.queryUserInfo(userId);
		setUser(user);
		System.out.println(getUser().getUserDetail());
		return super.execute();
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
