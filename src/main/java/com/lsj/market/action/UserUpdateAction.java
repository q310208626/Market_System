package com.lsj.market.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateAction extends ActionSupport{
	@Autowired
	private User user;
	@Autowired
	private UserDetail userDetail;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
//		setUser(userServiceImpl.queryUserInfo(id));
		try {
			setUser(userServiceImpl.queryUserInfo(user.getId()));
//			getUser().getUserDetail().setAddress(getUserDetail().getAddress());
			getUser().getUserDetail().setName(getUserDetail().getName());
//			getUser().getUserDetail().setPhone(getUserDetail().getPhone());
			getUser().getUserDetail().setSex(getUserDetail().getSex());
			userServiceImpl.updateUserInfo(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
		
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
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
}
