package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.bean.Order;

public interface OrderService {
	
	/** 
	* @Title: addOrder 
	* @Description: TODO 通过详细订单添加订单
	* @param order
	* @param detailOrders
	* @return 
	* @return Serializable 
	* 
	*/
	Serializable addOrder(Order order,List<MarketCar> marketCars);
	
	/** 
	* @Title: deleteOrder 
	* @Description: TODO 删除订单
	* @param order 
	* @return void 
	* 
	*/
	void deleteOrder(Order order);
	/** 
	* @Title: getOrderByUser 
	* @Description: TODO 查询用户订单
	* @param userId
	* @return 
	* @return List<Order> 
	* 
	*/
	List<Order> getOrderByUser(int userId);
	
	/** 
	* @Title: queryOrderByIdGet 
	* @Description: TODO 通过id查询Order是否存在
	* @param orderId
	* @return 
	* @return Order 
	* 
	*/
	Order queryOrderByIdGet(int orderId);
}
