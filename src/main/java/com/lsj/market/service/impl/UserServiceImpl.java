package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.dao.UserDao;
import com.lsj.market.dao.impl.UserDaoImpl;
import com.lsj.market.service.UserService;


/** 
* @ClassName: UserServiceImpl 
* @Description: 用户Service实现层
* @author hdmi
* @date Jun 22, 2017 8:01:13 PM 
*  
*/
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDaoImpl userDaoImpl;
	
	@Override
	public Serializable registService(User user) {
		return userDaoImpl.save(user);
	}

	@Override
	public void deleteService(User user) {
		// TODO Auto-generated method stub
		userDaoImpl.delete(user);
	}
	
	@Override
	public List<User> Login(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryByAccAndPass(user);
	}
	
	
	@Override
	public User queryUserInfo(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryById(id);
	}
	
	@Override
	public User queryUserInfoGet(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryByIdGet(id);
	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub
		userDaoImpl.update(user);
	}

	public UserDaoImpl getUserDaoImpl() {
		return userDaoImpl;
	}
	
	 

	@Override
	public boolean updateUserPassword(User user, String newPwd, String newPwdConf) {
		// TODO Auto-generated method stub
		
		if ((newPwd!=null||!newPwd.equals(""))&&(newPwdConf!=null||!newPwdConf.equals(""))){
			if (newPwd.equals(newPwdConf)) {
				List<User> userList=userDaoImpl.queryByAccAndPass(user);
				if (userList.size()>0) {
					user=userDaoImpl.queryById(userList.get(0).getId());
					System.out.println(user.getUserDetail());
					user.setPassword(newPwd);
					userDaoImpl.save(user);
					return true;
				}
			}
		}
		return false;
	}

	public void setUserDaoImpl(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
}
