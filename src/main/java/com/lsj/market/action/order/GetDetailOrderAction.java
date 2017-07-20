package com.lsj.market.action.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.DetailOrder;
import com.lsj.market.bean.Order;
import com.lsj.market.service.impl.DetailOrderServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GetDetailOrderAction extends ActionSupport{
	@Autowired
	private DetailOrderServiceImpl detailOrderServiceImpl;
	
	private int orderId;
	private List<DetailOrder> detailOrderList;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		detailOrderList=detailOrderServiceImpl.getDetailOrderByOrder(orderId);
		if(detailOrderList!=null){
			return SUCCESS;
		}
		return ERROR;
	}

	public DetailOrderServiceImpl getDetailOrderServiceImpl() {
		return detailOrderServiceImpl;
	}

	public void setDetailOrderServiceImpl(
			DetailOrderServiceImpl detailOrderServiceImpl) {
		this.detailOrderServiceImpl = detailOrderServiceImpl;
	}

	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<DetailOrder> getDetailOrderList() {
		return detailOrderList;
	}

	public void setDetailOrderList(List<DetailOrder> detailOrderList) {
		this.detailOrderList = detailOrderList;
	}
	
	
}
