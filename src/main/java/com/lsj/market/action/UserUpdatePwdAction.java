package com.lsj.market.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdatePwdAction extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private User user;
	private String newPwd;
	private String newPwdConf;
	private String action="update_pwd";
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		boolean result=false;
		try {
			result=userServiceImpl.updateUserPassword(user, newPwd, newPwdConf);
			if (result) {
				ActionContext.getContext().getSession().put("action", action);
				return SUCCESS;
			}
			return ERROR;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
		
	}
	
	
	public String getAction() {
		return action;
	}




	public User getUser() {
		return user;
	}


	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}



	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}



	public void setUser(User user) {
		this.user = user;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}



	public void setNewPwdConf(String newPwdConf) {
		this.newPwdConf = newPwdConf;
	}
	
	
}
