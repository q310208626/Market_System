package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.User;
import com.lsj.market.bean.UserDetail;
import com.lsj.market.dao.UserDao;


/** 
* @ClassName: UserDaoImpl 
* @Description: 用户Dao实现层
* @author hdmi
* @date Jun 22, 2017 7:59:04 PM 
*  
*/
@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory SessionFactory;
	private UserDetail userDetail;
	
	
	@Override
	public Serializable save(User user) {
		// TODO Auto-generated method stub
		return getSession().save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		user=(User) getSession().load(User.class, 9);
		getSession().delete(user);
	}
	
	@Override
	public List<User> queryByAccAndPass(User user) {
		// TODO Auto-generated method stub
		List<User> userList=null;
		StringBuilder queryAllString=new StringBuilder();
		queryAllString
			.append("from ")
			.append(User.class.getName())
			.append(" where account=:account")
			.append(" and password=:password");
		Query query=getSession().createQuery(queryAllString.toString());
		query.setString("account", user.getAccount());
		query.setString("password", user.getPassword());
		userList=query.list();
		return userList;
	}

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		User user=null;
		user=(User) getSession().load(User.class, id);
		return user;
	}
	
	@Override
	public User queryByIdGet(int id) {
		// TODO Auto-generated method stub
		return (User) getSession().get(User.class, id);
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		List<User> userList=null;
		StringBuilder queryAllString=new StringBuilder();
		queryAllString.append("from ").append(User.class.getName());
		Query query=getSession().createQuery(queryAllString.toString());
		userList=query.list();
		return userList;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		getSession().update(user);
		
	}

	private Session getSession(){
		return SessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return SessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}
}
