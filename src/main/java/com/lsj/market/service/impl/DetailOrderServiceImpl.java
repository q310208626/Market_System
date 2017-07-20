package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.bean.Order;
import com.lsj.market.dao.impl.DetailOrderDaoImpl;
import com.lsj.market.service.DetailOrderService;
@Service
public class DetailOrderServiceImpl implements DetailOrderService{
	@Autowired
	private DetailOrderDaoImpl detailOrderDaoImpl;
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	@Override
	public Serializable addDetailOrder(DetailOrder detailOrder) {
		// TODO Auto-generated method stub
		return detailOrderDaoImpl.add(detailOrder);
	}
	
	

	@Override
	public Serializable addDetailOrderFromMarketCar(MarketCar marketCar) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteDetailOrder(DetailOrder detailOrder) {
		// TODO Auto-generated method stub
		detailOrderDaoImpl.delete(detailOrder);
	}

	@Override
	public List<DetailOrder> getDetailOrderByOrder(int orderId) {
		// TODO Auto-generated method stub
		Order tempOrder=orderServiceImpl.queryOrderByIdGet(orderId);
		if(tempOrder==null){
			return null;
		}
		return detailOrderDaoImpl.queryByOrderId(orderId);
	}

	public DetailOrderDaoImpl getDetailOrderDaoImpl() {
		return detailOrderDaoImpl;
	}

	public void setDetailOrderDaoImpl(DetailOrderDaoImpl detailOrderDaoImpl) {
		this.detailOrderDaoImpl = detailOrderDaoImpl;
	}



	public OrderServiceImpl getOrderServiceImpl() {
		return orderServiceImpl;
	}



	public void setOrderServiceImpl(OrderServiceImpl orderServiceImpl) {
		this.orderServiceImpl = orderServiceImpl;
	}
	
	

}
