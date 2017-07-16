package com.lsj.market.dao;

import java.io.Serializable;
import java.util.List;

import javax.swing.ListModel;

import org.hibernate.sql.Delete;

import com.lsj.market.bean.DetailOrder;

public interface DetailOrderDao {
	/** 
	* @Title: add 
	* @Description: TODO 添加详细订单
	* @param detailOrder
	* @return 
	* @return Serializable 
	* 
	*/
	Serializable add(DetailOrder detailOrder);
	/** 
	* @Title: delete 
	* @Description: TODO 删除详细订单
	* @param detailOrder 
	* @return void 
	* 
	*/
	void delete(DetailOrder detailOrder);
	
	/** 
	* @Title: queryByOrderId 
	* @Description: TODO通过订单号查询一系列订单
	* @param orderId
	* @return 
	* @return List<DetailOrder> 
	* 
	*/
	List<DetailOrder> queryByOrderId(int orderId);
}
