package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.FlowersCate;

public interface GoodsCateService {
	/** 
	* @Title: queryAllFlowersCates 
	* @Description: TODO 查询所有花种类
	* @param @return     
	* @return List<FlowersCate> 
	* @throws 
	*/
	public List<FlowersCate> queryAllFlowersCates();

	/** 
	* @Title: addFlowerCate 
	* @Description: TODO 添加花种类
	* @param @param flowersCate
	* @param @return     
	* @return Serializable 
	* @throws 
	*/
	public Serializable addFlowerCate(FlowersCate flowersCate);
	/** 
	* @Title: deleteFlowerCate 
	* @Description: TODO 删除花种类
	* @param @param id     
	* @return void 
	* @throws 
	*/
	public void deleteFlowerCate(int id);
	/** 
	* @Title: updateCate 
	* @Description: TODO 更新花的种类
	* @param @param flowersCate     
	* @return void 
	* @throws 
	*/
	public void updateCate(FlowersCate flowersCate);
	
	/** 
	* @Title: getFlowersCateById 
	* @Description: TODO 通过id获取花（商品）种类
	* @param @param id
	* @param @return     
	* @return FlowersCate 
	* @throws 
	*/
	public FlowersCate getFlowersCateById(int id);
}
