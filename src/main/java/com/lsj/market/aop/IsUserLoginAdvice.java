package com.lsj.market.aop;

import java.lang.reflect.Method;
import java.util.Map;

import org.aspectj.weaver.Advice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.MethodInterceptor;

import com.lsj.market.exception.UserNotFoundException;
import com.opensymphony.xwork2.ActionContext;

public class IsUserLoginAdvice{

	public void isUserLogin() throws UserNotFoundException{
		// TODO Auto-generated method stub
		int id=0;
		Map sessionMap=ActionContext.getContext().getSession();
		System.out.println(sessionMap);
		try {
			//这里在一开始时userId是不存在的可能会抛出NullPointException，catch起来
			id=(int) sessionMap.get("userId");
			//在用户注销时我把session中的userId设为0
			if(id==0){
				throw new UserNotFoundException();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserNotFoundException();
		}

	}
	
}

