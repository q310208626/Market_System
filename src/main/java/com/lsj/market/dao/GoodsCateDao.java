package com.lsj.market.dao;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.FlowersCate;

public interface GoodsCateDao {
	
	/** 
	* @Title: queryAll 
	* @Description: TODO 查询商品种类
	* @param @return     
	* @return List<FlowersCate> 
	* @throws 
	*/
	public List<FlowersCate> queryAll();
	/** 
	* @Title: save 
	* @Description: TODO 添加商品种类
	* @param @param flowersCate     
	* @return Serializable 
	* @throws 
	*/
	public Serializable save(FlowersCate flowersCate);
	/** 
	* @Title: delete 
	* @Description: TODO 删除商品种类
	* @param @param id     
	* @return void 
	* @throws 
	*/
	public void delete(int id);
	/** 
	* @Title: update 
	* @Description: TODO 更新商品种类
	* @param @param flowersCate     
	* @return void 
	* @throws 
	*/
	public void update(FlowersCate flowersCate);
}
