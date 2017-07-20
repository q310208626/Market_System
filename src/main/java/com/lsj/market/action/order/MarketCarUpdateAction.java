package com.lsj.market.action.order;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MarketCarUpdateAction extends ActionSupport{
	private MarketCar marketCar;
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("marketCarId=============="+marketCar.getId());
			MarketCar tempMarketCar=marketCarServiceImpl.queryMarketCarById(marketCar.getId());
			tempMarketCar.setGoodNum(marketCar.getGoodNum());
			marketCarServiceImpl.UpdateMarketCar(tempMarketCar);
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

	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}

	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}

	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	
	
}
