package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.User;

/** 
* @ClassName: UserService 
* @Description: UserService 接口
* @author hdmi
* @date Jun 22, 2017 8:07:48 PM 
*  
*/
public interface UserService {
	
	/** 
	* @Title: registService 
	* @Description: User注册功能
	* @param  user 
	* @return Serializable (int)
	* @throws 
	*/
	public Serializable registService(User user);
	
	/** 
	* @Title: deleteService 
	* @Description: User删除(管理员)
	* @param  user  
	* @return void 
	* @throws 
	*/
	public void deleteService(User user);
	
	
	/** 
	* @Title: Login 
	* @Description: 用户登录功能
	* @param  user 
	* @return List 
	* @throws 
	*/
	public List<User> Login(User user);
	
	/** 
	* @Title: queryUserInfo 
	* @Description: 通过Id查询获取User
	* @param id 
	* @return User 
	* @throws 
	*/
	public User queryUserInfo(int id);
	
	public void updateUserInfo(User user);
}
