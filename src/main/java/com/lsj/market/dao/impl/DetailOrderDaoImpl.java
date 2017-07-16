package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.Order;
import com.lsj.market.dao.DetailOrderDao;

@Repository
public class DetailOrderDaoImpl implements DetailOrderDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Serializable add(DetailOrder detailOrder) {
		// TODO Auto-generated method stub
		return getSession().save(detailOrder);
	}

	@Override
	public void delete(DetailOrder detailOrder) {
		// TODO Auto-generated method stub
		getSession().delete(detailOrder);
	}

	@Override
	public List<DetailOrder> queryByOrderId(int orderId) {
		// TODO Auto-generated method stub
		List<DetailOrder> detailOrders=new ArrayList<DetailOrder>();
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("from ")
					.append(DetailOrder.class.getName())
					.append(" where orderId=:orderId");
		Query query=getSession().createQuery(stringBuilder.toString());
		query.setInteger("orderId", orderId);
		
		detailOrders=query.list();
		return detailOrders;
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
