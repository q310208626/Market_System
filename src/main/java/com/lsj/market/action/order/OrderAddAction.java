package com.lsj.market.action.order;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.bean.Order;
import com.lsj.market.service.impl.DetailOrderServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.lsj.market.service.impl.OrderServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class OrderAddAction extends ActionSupport{
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	private List<MarketCar> marketCarList;
	
	private Order order;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub

			try {
				orderServiceImpl.addOrder(order, marketCarList);
				return SUCCESS;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
			
	}
	
	public OrderServiceImpl getOrderServiceImpl() {
		return orderServiceImpl;
	}
	public void setOrderServiceImpl(OrderServiceImpl orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}

	public List<MarketCar> getMarketCarList() {
		return marketCarList;
	}
	public void setMarketCarList(List<MarketCar> marketCarList) {
		this.marketCarList = marketCarList;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	
	
}
