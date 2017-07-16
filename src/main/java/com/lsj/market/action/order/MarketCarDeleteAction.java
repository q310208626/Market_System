package com.lsj.market.action.order;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.MarketCar;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MarketCarDeleteAction extends ActionSupport{
	private MarketCar marketCar;
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(marketCar.getId()==0) return ERROR;
		
		try {
			MarketCar tempMarketCar=marketCarServiceImpl.queryMarketCarById(marketCar.getId());
			if(tempMarketCar==null) return ERROR;
			
			marketCarServiceImpl.deleteMarketCar(tempMarketCar.getId());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}

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
