package com.lsj.market.action.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLoginAction extends ActionSupport{
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private User user;
	private String action="user_login";
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<User> useList;
			useList=userServiceImpl.Login(user);
			if (useList.size()>0) {
				User user=useList.get(0);
				Map session=ActionContext.getContext().getSession();
				System.out.println(user.getId());
				session.put("userId", user.getId());
				session.put("userAccount", user.getAccount());
				session.put("action", action);
				return SUCCESS;
			}else {
				return ERROR;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
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
