package com.lsj.market.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Log4jConfigurer;

import com.lsj.market.action.order.GetMarketCarAction;
import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;
import com.lsj.market.dao.impl.MarketCarDaoImpl;
import com.lsj.market.service.impl.DetailOrderServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.lsj.market.service.impl.OrderServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;

import freemarker.template.Configuration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class HibernateTest {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	@Autowired
	private DetailOrderServiceImpl detailOrderServiceImpl;
	
	private Flower flower;
	private User user;
	
	@Autowired
	private MarketCarDaoImpl marketCarDaoImpl;
	private MarketCar marketCar;
	private DetailOrder detailOrder;
	private Order order;
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	
	@Before
	public void before() {
		
	}


	@Test
	public void test() {
		int cateId=5;
		List<Flower> flowers= goodsServiceImpl.getFlowerByCate(cateId);
		System.out.println(flowers.size());
	}

	@After
	public void after() {	
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}


	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}


	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}


	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}


	public MarketCarDaoImpl getMarketCarDaoImpl() {
		return marketCarDaoImpl;
	}


	public void setMarketCarDaoImpl(MarketCarDaoImpl marketCarDaoImpl) {
		this.marketCarDaoImpl = marketCarDaoImpl;
	}


	public MarketCarServiceImpl getMarketCarServiceImpl() {
		return marketCarServiceImpl;
	}


	public void setMarketCarServiceImpl(MarketCarServiceImpl marketCarServiceImpl) {
		this.marketCarServiceImpl = marketCarServiceImpl;
	}


	public OrderServiceImpl getOrderServiceImpl() {
		return orderServiceImpl;
	}


	public void setOrderServiceImpl(OrderServiceImpl orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}


	public DetailOrderServiceImpl getDetailOrderServiceImpl() {
		return detailOrderServiceImpl;
	}


	public void setDetailOrderServiceImpl(
			DetailOrderServiceImpl detailOrderServiceImpl) {
		this.detailOrderServiceImpl = detailOrderServiceImpl;
	}
	
	
	
}
