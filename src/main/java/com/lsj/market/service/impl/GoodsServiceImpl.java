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
	public List<Flower> getFlowerByCate(int cateId) {
		// TODO Auto-generated method stub
		return goodsDaoImpl.queryFlowerByCateId(cateId);
	}




	@Override
	public void deleteFlower(int id) {
		// TODO Auto-generated method stub
		goodsDaoImpl.deleteFlower(id);
	}



	@Override
	public void updateFlower(Flower flower) {
		// TODO Auto-generated method stub
		goodsDaoImpl.updateFlower(flower);
	}
	


	@Override
	public Serializable addFlower(Flower flower) {
		// TODO Auto-generated method stub
		return goodsDaoImpl.save(flower);
	}


	@Override
	public Flower queryFlowerById(int id) {
		// TODO Auto-generated method stub
		Flower flower=goodsDaoImpl.queryById(id);
		return flower;
	}
	

	@Override
	public Flower queryFlowerByIdGet(int id) {
		// TODO Auto-generated method stub
		return goodsDaoImpl.queryByIdGet(id);
	}


	public GoodsDaoImpl getGoodsDaoImpl() {
		return goodsDaoImpl;
	}

	public void setGoodsDaoImpl(GoodsDaoImpl goodsDaoImpl) {
		this.goodsDaoImpl = goodsDaoImpl;
	}
	
}
