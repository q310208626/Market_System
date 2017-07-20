package com.lsj.market.action.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Order;
import com.lsj.market.bean.User;
import com.lsj.market.service.impl.OrderServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GetOrderAction extends ActionSupport{
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	private User user;
	private List<Order> orderList;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		orderList=orderServiceImpl.getOrderByUser(user.getId());
		if(orderList!=null){
			return SUCCESS;
		}else {
			return ERROR;
		}
		
	}
	public OrderServiceImpl getOrderServiceImpl() {
		return orderServiceImpl;
	}
	public void setOrderServiceImpl(OrderServiceImpl orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
}
