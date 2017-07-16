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
	* @Description: 通过Id查询获取User，这个信息没被用到的属性是不被加载
	* @param id 
	* @return User 
	* @throws 
	*/
	public User queryUserInfo(int id);
	
	/** 
	* @Title: queryUserInfoGet 
	* @Description: TODO 根据Id获取完整用户信息
	* @param @param id
	* @param @return     
	* @return User 
	* @throws 
	*/
	public User queryUserInfoGet(int id);
	
	/** 
	* @Title: updateUserInfo 
	* @Description: TODO 更新用户信息 
	* @param @param user     
	* @return void 
	* @throws 
	*/
	public void updateUserInfo(User user);
	
	/** 
	* @Title: updateUserPassword 
	* @Description: TODO更新用户密码
	* @param @param user
	* @param @param newPwd
	* @param @param newPwdConf
	* @param @return     
	* @return boolean 
	* @throws 
	*/
	public boolean updateUserPassword(User user,String newPwd,String newPwdConf);
	
}
