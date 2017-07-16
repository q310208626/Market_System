package com.lsj.market.service;

import java.io.Serializable;
import java.util.List;


import com.lsj.market.bean.MarketCar;

public interface MarketCarService {
	/** 
	* @Title: addMarketCar 
	* @Description: TODO 添加MarketCar
	* @param @param marketCar
	* @param @return     
	* @return Serializable 
	* @throws 
	*/
	public Serializable  addMarketCar(MarketCar marketCar);
	/** 
	* @Title: UpdateMarketCar 
	* @Description: TODO 更新MarketCar信息
	* @param @param marketCar     
	* @return void 
	* @throws 
	*/
	public void UpdateMarketCar(MarketCar marketCar);
	/** 
	* @Title: queryMarketCarByUserId 
	* @Description: TODO 通过UserId查询用户的购物车
	* @param @param userId
	* @param @return     
	* @return List<MarketCar> 
	* @throws 
	*/
	public List<MarketCar> queryMarketCarByUserId(int userId);
	/** 
	* @Title: queryMarketCarById 
	* @Description: TODO 通过购物车Id查询购物车
	* @param @param id
	* @param @return     
	* @return MarketCar 
	* @throws 
	*/
	public MarketCar queryMarketCarById(int id);
	/** 
	* @Title: deleteMarketCar 
	* @Description: TODO 通过id删除购物车
	* @param @param id     
	* @return void 
	* @throws 
	*/
	public void deleteMarketCar(int id);
}
