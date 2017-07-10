package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.dao.GoodsCateDao;
@Repository
public class GoodsCateDaoImpl implements GoodsCateDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<FlowersCate> queryAll() {
		// TODO Auto-generated method stub
		List<FlowersCate> flowersCateList=new ArrayList<FlowersCate>();
		StringBuilder queryStringBuilder=new StringBuilder();
		queryStringBuilder
					.append("from ")
					.append(FlowersCate.class.getName());
		Query query =getSession().createQuery(queryStringBuilder.toString());
		flowersCateList=query.list();
		return flowersCateList;
	}

	@Override
	public Serializable save(FlowersCate flowersCate) {
		// TODO Auto-generated method stub
		return getSession().save(flowersCate);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		FlowersCate flowersCate=(FlowersCate) getSession().load(FlowersCate.class,id);
		getSession().delete(flowersCate);
	}

	@Override
	public void update(FlowersCate flowersCate) {
		// TODO Auto-generated method stub
		getSession().update(flowersCate);
	}
	
	

	@Override
	public FlowersCate load(int id) {
		// TODO Auto-generated method stub
		return (FlowersCate) getSession().load(FlowersCate.class, id);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}
