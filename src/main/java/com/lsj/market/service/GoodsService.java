package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.dao.impl.GoodsDaoImpl;

public interface GoodsService {
	
	public List<Flower> getAllFlower();
	
	public void deleteFlower(int id);
	
	public void updateFlower(Flower flower);
	
	public Serializable addFlower(Flower flower);
	
	public Flower queryFlowerById(int id);
	
	public Flower queryFlowerByIdGet(int id);
	
}
