package com.lsj.market.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;
import com.lsj.market.dao.impl.GoodsCateDaoImpl;
import com.lsj.market.dao.impl.GoodsDaoImpl;
import com.lsj.market.service.GoodsCateService;
import com.lsj.market.service.GoodsService;

@Service
public class GoodsCateServiceImpl implements GoodsCateService{
	@Autowired
	private GoodsCateDaoImpl  goodsCateDaoImpl;
	

	@Override
	public List<FlowersCate> queryAllFlowersCates() {
		// TODO Auto-generated method stub
		return goodsCateDaoImpl.queryAll();
	}

	@Override
	public Serializable addFlowerCate(FlowersCate flowersCate) {
		// TODO Auto-generated method stub
		return goodsCateDaoImpl.save(flowersCate);
		
	}

	@Override
	public void deleteFlowerCate(int id) {
		// TODO Auto-generated method stub
		goodsCateDaoImpl.delete(id);
	}

	@Override
	public void updateCate(FlowersCate flowersCate) {
		// TODO Auto-generated method stub
		goodsCateDaoImpl.update(flowersCate);
	}

	public GoodsCateDaoImpl getGoodsCateDaoImpl() {
		return goodsCateDaoImpl;
	}

	public void setGoodsCateDaoImpl(GoodsCateDaoImpl goodsCateDaoImpl) {
		this.goodsCateDaoImpl = goodsCateDaoImpl;
	}

	@Override
	public FlowersCate getFlowersCateById(int id) {
		// TODO Auto-generated method stub
		return goodsCateDaoImpl.load(id);
	}

	
	
}
