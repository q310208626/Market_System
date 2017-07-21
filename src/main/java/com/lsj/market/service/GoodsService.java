package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.dao.impl.GoodsDaoImpl;

public interface GoodsService {
	
	/** 
	* @Title: getAllFlower 获取全部商品
	* @Description: TODO
	* @return 
	* @return List<Flower> 
	* 
	*/
	public List<Flower> getAllFlower();
	
	/** 
	* @Title: getFlowerByCate 
	* @Description: TODO 通过种类获取商品
	* @param cateId
	* @return 
	* @return List<Flower> 
	* 
	*/
	public List<Flower> getFlowerByCate(int cateId);
	
	/** 
	* @Title: deleteFlower 
	* @Description: TODO 删除商品
	* @param id 
	* @return void 
	* 
	*/
	public void deleteFlower(int id);
	
	/** 
	* @Title: updateFlower 
	* @Description: TODO 更新商品
	* @param flower 
	* @return void 
	* 
	*/
	public void updateFlower(Flower flower);
	
	/** 
	* @Title: addFlower 
	* @Description: TODO 添加商品
	* @param flower
	* @return 
	* @return Serializable 
	* 
	*/
	public Serializable addFlower(Flower flower);
	
	/** 
	* @Title: queryFlowerById 
	* @Description: TODO 通过id查询商品（不能保证商品存在）
	* @param id
	* @return 
	* @return Flower 
	* 
	*/
	public Flower queryFlowerById(int id);
	
	/** 
	* @Title: queryFlowerByIdGet 
	* @Description: TODO 通过id查询商品是否存在
	* @param id
	* @return 
	* @return Flower 
	* 
	*/
	public Flower queryFlowerByIdGet(int id);
	
}
