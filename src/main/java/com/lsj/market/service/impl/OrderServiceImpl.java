package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.bean.Order;
import com.lsj.market.bean.User;
import com.lsj.market.dao.impl.OrderDaoImpl;
import com.lsj.market.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDaoImpl orderDaoImpl;
	@Autowired
	private DetailOrderServiceImpl detailOrderServiceImpl;
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public Serializable addOrder(Order order, List<MarketCar> marketCars) throws RuntimeErrorException{
		// TODO Auto-generated method stub
		try {
			order.setBuyDate(new Date());
			
			for (int i = 0; i < marketCars.size(); i++) {
				MarketCar tempMarket=marketCarServiceImpl.queryMarketCarById(marketCars.get(i).getId());
				marketCarServiceImpl.deleteMarketCar(tempMarket.getId());
				DetailOrder detailOrder=new DetailOrder();
				detailOrder.setFlower(tempMarket.getFlower());
				detailOrder.setGoodsNum(tempMarket.getGoodNum());
				detailOrder.setTotalPrice(tempMarket.getTotalPrice());
				detailOrder.setOrder(order);
				order.getDetailOrders().add(detailOrder);
			}
			orderDaoImpl.add(order);
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
			
		}
	}

	@Override
	public void deleteOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> getOrderByUser(int userId) {
		// TODO Auto-generated method stub
		User tempUser=userServiceImpl.queryUserInfoGet(userId);
		if(tempUser==null) {
			return null;
		}else{
			return orderDaoImpl.queryOrderByUser(userId);
		}
		
	}
	

	@Override
	public Order queryOrderByIdGet(int orderId) {
		// TODO Auto-generated method stub
		return orderDaoImpl.queryOrderById(orderId);
	}

	public OrderDaoImpl getOrderDaoImpl() {
		return orderDaoImpl;
	}

	public void setOrderDaoImpl(OrderDaoImpl orderDaoImpl) {
		this.orderDaoImpl = orderDaoImpl;
	}

	public DetailOrderServiceImpl getDetailOrderServiceImpl() {
		return detailOrderServiceImpl;
	}

	public void setDetailOrderServiceImpl(
			DetailOrderServiceImpl detailOrderServiceImpl) {
		this.detailOrderServiceImpl = detailOrderServiceImpl;
	}

	public MarketCarServiceImpl getMarketCarServiceImpl() {
		return marketCarServiceImpl;
	}

	public void setMarketCarServiceImpl(MarketCarServiceImpl marketCarServiceImpl) {
		this.marketCarServiceImpl = marketCarServiceImpl;
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	

}
