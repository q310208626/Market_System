package com.lsj.market.dao;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.MarketCar;

/**
 * @ClassName MarketCarDao
 * @author hdmi
 * @Date Jul 11, 20177:40:39 PM
 * @Description MarketCar数据访问层
 */
public interface MarketCarDao {
	/** 
	* @Title: add 
	* @Description: TODO 添加购物车
	* @param @param marketCar
	* @param @return     
	* @return Serializable 
	* @throws 
	*/
	public Serializable add(MarketCar marketCar);
	/** 
	* @Title: update 
	* @Description: TODO 更新购物车
	* @param @param marketCar     
	* @return void 
	* @throws 
	*/
	public void update (MarketCar marketCar);
	/** 
	* @Title: queryMarketCarById 
	* @Description: TODO 通过购物车id查询购物车
	* @param @param id
	* @param @return     
	* @return MarketCar 
	* @throws 
	*/
	public MarketCar queryMarketCarById(int id);
	/** 
	* @Title: queryMarketCarByUserId 
	* @Description: TODO 通过UserId查询购物车
	* @param @param userId
	* @param @return     
	* @return List<MarketCar> 
	* @throws 
	*/
	public List<MarketCar> queryMarketCarByUserId(int userId);
	/** 
	* @Title: delete 
	* @Description: TODO 通过id删除购物车
	* @param @param id     
	* @return void 
	* @throws 
	*/
	public void delete(int id);
}
