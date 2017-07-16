package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.MarketCar;
import com.lsj.market.dao.MarketCarDao;
@Repository
public class MarketCarDaoImpl implements MarketCarDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Serializable add(MarketCar marketCar) {
		// TODO Auto-generated method stub
		Serializable resultId=getSession().save(marketCar);
		return resultId;
	}

	@Override
	public void update(MarketCar marketCar) {
		// TODO Auto-generated method stub
		getSession().update(marketCar);
	}

	@Override
	public MarketCar queryMarketCarById(int id) {
		// TODO Auto-generated method stub
		MarketCar marketCar=null;
		marketCar=(MarketCar) getSession().load(MarketCar.class, id);
		return marketCar;
	}

	@Override
	public List<MarketCar> queryMarketCarByUserId(int userId) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("from ")
					.append(MarketCar.class.getName())
					.append(" where userId=:id");
		Query query=getSession().createQuery(stringBuilder.toString());
		query.setInteger("id", userId);
		return query.list();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		MarketCar marketCar=(MarketCar) getSession().load(MarketCar.class, id);
		getSession().delete(marketCar);
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
