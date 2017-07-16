package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.Order;
import com.lsj.market.dao.OrderDao;

@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Order queryOrderById(int id) {
		// TODO Auto-generated method stub
		return (Order) getSession().load(Order.class, id);
	}

	@Override
	public List<Order> queryOrderByUser(int userId) {
		// TODO Auto-generated method stub
		List<Order> orders=new ArrayList<Order>();
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("from ")
					.append(Order.class.getName())
					.append(" where userId=:userId");
		Query query=getSession().createQuery(stringBuilder.toString());
		query.setInteger("userId", userId);
		
		orders=query.list();
		return orders;
	}

	@Override
	public Serializable add(Order order) {
		// TODO Auto-generated method stub
		return getSession().save(order);
	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub
		getSession().delete(order);
	}

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
