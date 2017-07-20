package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.MarketCar;

public interface DetailOrderService {
	/** 
	* @Title: addDetailOrder 
	* @Description: TODO 添加详细订单
	* @param detailOrder
	* @return 
	* @return Serializable 
	* 
	*/
	Serializable addDetailOrder(DetailOrder detailOrder);
	
	/** 
	* @Title: addDetailOrderFromMarketCar 
	* @Description: TODO 把购物车转成一个详细订单
	* @param marketCar
	* @return 
	* @return Serializable 
	* 
	*/
	Serializable addDetailOrderFromMarketCar(MarketCar marketCar);
	
	/** 
	* @Title: deleteDetailOrder 
	* @Description: TODO 删除详细订单
	* @param detailOrder 
	* @return void 
	* 
	*/
	void deleteDetailOrder(DetailOrder detailOrder);
	/** 
	* @Title: getDetailOrderByOrder 
	* @Description: TODO通过订单号获取系列详细订单
	* @param orderId
	* @return 
	* @return List<DetailOrder> 
	* 
	*/
	List<DetailOrder> getDetailOrderByOrder(int orderId);
}
