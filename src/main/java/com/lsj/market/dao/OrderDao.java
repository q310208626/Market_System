package com.lsj.market.dao;

import java.io.IOError;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.Order;

public interface OrderDao {

	/** 
	* @Title: queryOrderById 
	* @Description: TODO 通过Id查询订单
	* @param id
	* @return Order 
	* 
	*/
	public Order queryOrderById(int id);
	

	/** 
	* @Title: queryOrderByUser 
	* @Description: TODO 通过用户Id查询用户一系列订单
	* @param userId
	* @return 
	* @return List<Order> 
	* 
	*/
	public List<Order> queryOrderByUser(int userId);
	/** 
	* @Title: add 
	* @Description: TODO 添加订单
	* @param @param order
	* @param @return     
	* @return Serializable 
	* @throws 
	*/
	public Serializable add(Order order);
	/** 
	* @Title: delete 
	* @Description: TODO 删除订单
	* @param @param order     
	* @return void 
	* @throws 
	*/
	public void delete(Order order);
}
