package com.lsj.market.dao;

import java.io.Serializable;
import java.util.List;

import com.lsj.market.bean.Flower;



/**
 * @ClassName GoodsDao
 * @author hdmi
 * @Date Jul 1, 20175:02:51 PM
 * @Description 商品数据层接口
 */
public interface GoodsDao {
	

	/** 
	* @Title: queryAllFlowers 
	* @Description: TODO 查询所有花(商品)
	* @param @return     
	* @return List<Flower> 
	* @throws 
	*/
	public List<Flower> queryAllFlowers();
	
	/** 
	* @Title: queryFlowerByCateId 
	* @Description: TODO 通过商品种类Id查询商品
	* @param cateId
	* @return 
	* @return List<Flower> 
	* 
	*/
	public List<Flower> queryFlowerByCateId(int cateId);
	
	/** 
	* @Title: deleteFlower 
	* @Description: TODO 删除花（商品）
	* @param      
	* @return void 
	* @throws 
	*/
	public void deleteFlower(int id);
	
	/** 
	* @Title: updateFlower 
	* @Description: TODO 更新花（商品）信息
	* @param @param flower（所要更新的花）    
	* @return void 
	* @throws 
	*/
	public void updateFlower(Flower flower);
	
	
	/** 
	* @Title: save 
	* @Description: TODO 存储花（商品）
	* @param @param flower
	* @param @return     
	* @return Serializable 
	* @throws 
	*/
	public Serializable save(Flower flower);
	
	/** 
	* @Title: queryById 
	* @Description: TODO 通过id查找商品，没用到的属性不被加载
	* @param @param id
	* @param @return     
	* @return Flower 
	* @throws 
	*/
	public Flower queryById(int id);
	
	/** 
	* @Title: queryByIdGet 
	* @Description: TODO 通过id查找商品完整信息
	* @param @param id
	* @param @return     
	* @return Flower 
	* @throws 
	*/
	public Flower queryByIdGet(int id);
}
