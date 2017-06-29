package com.lsj.market.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ToUserDetailAction extends ActionSupport{
	
	@Autowired
	private User user;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return super.execute();
	}
	

}
