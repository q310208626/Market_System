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
	private UserServiceImpl userServiceImpl;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

		try {
			/*User tempUser=userServiceImpl.queryUserInfo(getUser().getId());
			System.out.println(tempUser.getRole());
			getUser().setRole(tempUser.getRole());*/
//			setUser(userServiceImpl.queryUserInfo(user.getId()));
//			getUser().getUserDetail().setAddress(getUserDetail().getAddress());
//			getUser().getUserDetail().setName(getUserDetail().getName());
//			getUser().getUserDetail().setPhone(getUserDetail().getPhone());
//			getUser().getUserDetail().setSex(getUserDetail().getSex());
			userServiceImpl.updateUserInfo(getUser());
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
	

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
}
