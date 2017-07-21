package com.lsj.market.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsj.market.bean.Flower;
import com.lsj.market.dao.GoodsDao;

@Repository
public class GoodsDaoImpl implements GoodsDao{
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Flower> queryAllFlowers() {
		// TODO Auto-generated method stub
		List<Flower> flowerList=new ArrayList<>();
		StringBuilder queryStringBuilder=new StringBuilder();
		queryStringBuilder
				.append("from ")
				.append(Flower.class.getName());
		Query goodsQuery=getSession().createQuery(queryStringBuilder.toString());
		flowerList=goodsQuery.list();
		return flowerList;
	}
	
	
	
	@Override
	public List<Flower> queryFlowerByCateId(int cateId) {
		// TODO Auto-generated method stub
		StringBuilder queryBuilder=new StringBuilder();
		queryBuilder.append("from ")
					.append(Flower.class.getName())
					.append(" where flowersCateId=:flowersCateId");
		Query query=getSession().createQuery(queryBuilder.toString());
		query.setInteger("flowersCateId", cateId);
		return query.list();
	}



	@Override
	public void deleteFlower(int id) {
		// TODO Auto-generated method stub
		Flower flower=(Flower) getSession().load(Flower.class,id);
		getSession().delete(flower);
	}



	@Override
	public void updateFlower(Flower flower) {
		// TODO Auto-generated method stub
		getSession().update(flower);
	}
	
	
	@Override
	public Serializable save(Flower flower) {
		// TODO Auto-generated method stub
		return getSession().save(flower);
	}
	
	



	@Override
	public Flower queryById(int id) {
		// TODO Auto-generated method stub
		Flower tempFlower=null;
		tempFlower=(Flower) getSession().load(Flower.class, id);
		return tempFlower;
	}
	
	


	@Override
	public Flower queryByIdGet(int id) {
		// TODO Auto-generated method stub
		return (Flower) getSession().get(Flower.class, id);
	}



	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
