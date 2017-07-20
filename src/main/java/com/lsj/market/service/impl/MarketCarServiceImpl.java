package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.MarketCar;
import com.lsj.market.dao.impl.MarketCarDaoImpl;
import com.lsj.market.service.MarketCarService;

@Service
public class MarketCarServiceImpl implements MarketCarService{
	@Autowired
	private MarketCarDaoImpl marketCarDaoImpl;
	
	@Override
	public Serializable addMarketCar(MarketCar marketCar) {
		// TODO Auto-generated method stub
		return marketCarDaoImpl.add(marketCar);
	}

	@Override
	public void UpdateMarketCar(MarketCar marketCar) {
		// TODO Auto-generated method stub
		float price=marketCar.getFlower().getPrice();
		int num=marketCar.getGoodNum();
		float totalPrice=price*num;
		marketCar.setTotalPrice(totalPrice);
		marketCarDaoImpl.update(marketCar);
	}

	@Override
	public List<MarketCar> queryMarketCarByUserId(int userId) {
		// TODO Auto-generated method stub
		return marketCarDaoImpl.queryMarketCarByUserId(userId);
	}

	@Override
	public MarketCar queryMarketCarById(int id) {
		// TODO Auto-generated method stub
		return marketCarDaoImpl.queryMarketCarById(id);
	}

	@Override
	public void deleteMarketCar(int id) {
		// TODO Auto-generated method stub
		marketCarDaoImpl.delete(id);
	}

	public MarketCarDaoImpl getMarketCarDaoImpl() {
		return marketCarDaoImpl;
	}

	public void setMarketCarDaoImpl(MarketCarDaoImpl marketCarDaoImpl) {
		this.marketCarDaoImpl = marketCarDaoImpl;
	}

}
