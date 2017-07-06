package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.Flower;
import com.lsj.market.dao.impl.GoodsDaoImpl;
import com.lsj.market.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDaoImpl goodsDaoImpl;
	@Override
	public List<Flower> getAllFlower() {
		// TODO Auto-generated method stub
		return goodsDaoImpl.queryAllFlowers();
	}
	
	
	
	@Override
	public void deleteFlower(int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateFlower(Flower flower) {
		// TODO Auto-generated method stub
		
	}
	


	@Override
	public Serializable addFlower(Flower flower) {
		// TODO Auto-generated method stub
		return goodsDaoImpl.save(flower);
	}



	public GoodsDaoImpl getGoodsDaoImpl() {
		return goodsDaoImpl;
	}

	public void setGoodsDaoImpl(GoodsDaoImpl goodsDaoImpl) {
		this.goodsDaoImpl = goodsDaoImpl;
	}
	
}
