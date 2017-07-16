package com.lsj.market.action.order;

import java.util.logging.ErrorManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.MarketCar;
import com.lsj.market.bean.User;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MarketCarAddAction extends ActionSupport{
	private Flower flower;
	private User user;
	private MarketCar marketCar;
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired 
	private MarketCarServiceImpl marketCarServiceImpl;
	
	private String errorMSG=""; 
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//查询用户是否存在
		System.out.println(user.getId());
		if(user==null||user.getId()==0||(user=userServiceImpl.queryUserInfo(user.getId()))==null){
			errorMSG="userNotFound";
			return ERROR;
		}
		//查询商品是否存在
		if(flower==null||flower.getId()==0||(flower=goodsServiceImpl.queryFlowerById(flower.getId()))==null){
			errorMSG="goodsNotFound";
			return ERROR;
		}
		//查询购买数量是够>0
		if(marketCar.getGoodNum()<=0){
			return ERROR;
		}
		
		try {
			float totalPrice=0;
			marketCar.setFlower(flower);
			marketCar.setUser(user);
			totalPrice=(float) (flower.getPrice()*marketCar.getGoodNum()*1.0);
			marketCar.setTotalPrice(totalPrice);
			marketCarServiceImpl.addMarketCar(marketCar);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			errorMSG="MCAddFailed";
			return ERROR;
		}
		
	}
	
	public Flower getFlower() {
		return flower;
	}
	public void setFlower(Flower flower) {
		this.flower = flower;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public MarketCar getMarketCar() {
		return marketCar;
	}
	public void setMarketCar(MarketCar marketCar) {
		this.marketCar = marketCar;
	}
	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}
	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public MarketCarServiceImpl getMarketCarServiceImpl() {
		return marketCarServiceImpl;
	}

	public void setMarketCarServiceImpl(MarketCarServiceImpl marketCarServiceImpl) {
		this.marketCarServiceImpl = marketCarServiceImpl;
	}

	public String getErrorMSG() {
		return errorMSG;
	}

	public void setErrorMSG(String errorMSG) {
		this.errorMSG = errorMSG;
	}
	
	
}
