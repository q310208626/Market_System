package com.lsj.market.action.order;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.MarketCar;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MarketCarUpdateAction extends ActionSupport{
	private MarketCar marketCar;
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return super.execute();
	}

	public MarketCar getMarketCar() {
		return marketCar;
	}

	public void setMarketCar(MarketCar marketCar) {
		this.marketCar = marketCar;
	}

	public MarketCarServiceImpl getMarketCarServiceImpl() {
		return marketCarServiceImpl;
	}

	public void setMarketCarServiceImpl(MarketCarServiceImpl marketCarServiceImpl) {
		this.marketCarServiceImpl = marketCarServiceImpl;
	}
	
}
