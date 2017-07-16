package com.lsj.market.dao;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.User;


/** 
* @ClassName: UserDao 
* @Description: 用户类数据层
* @author hdmi
* @date Jun 22, 2017 7:58:35 PM 
*  
*/
public interface UserDao {
	
	public Serializable save(User user);
	
	public void delete(User user);
	
	public List<User> queryByAccAndPass(User user);
	
	public User queryById(int id);
	
	public User queryByIdGet(int id);
	
	public List<User> queryAll();
	
	public void update(User user);
}
