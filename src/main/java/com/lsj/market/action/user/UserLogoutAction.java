package com.lsj.market.action.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserLogoutAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map session=ActionContext.getContext().getSession();
//		session.remove("userId");
		session.put("userId", 0);
		session.remove("userAccount");
		return super.execute();
	}
	

}
