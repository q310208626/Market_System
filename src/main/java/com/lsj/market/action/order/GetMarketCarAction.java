package com.lsj.market.action.order;

import java.util.List;

import javax.crypto.Mac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lsj.market.bean.MarketCar;
import com.lsj.market.service.impl.MarketCarServiceImpl;
import com.lsj.market.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.core.ReturnInstruction.Return;
@Controller("getMarketCarAction")
public class GetMarketCarAction extends ActionSupport{
	@Autowired
	private MarketCarServiceImpl marketCarServiceImpl;
	@Autowired
	private UserServiceImpl userServiceImpl;
	private List<MarketCar> marketCarList;
	private int userId=0;
	private float allPrice=0;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		userId=(int) ActionContext.getContext().getSession().get("userId");
//		if(userId==0||(userServiceImpl.queryUserInfo(userId))==null){
//			errorMSG="userNotFound";
//			return ERROR;
//		}
		try {
			marketCarList=marketCarServiceImpl.queryMarketCarByUserId(userId);
			marketCarList.forEach(mac->allPrice+=mac.getTotalPrice());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	
	public MarketCarServiceImpl getMarketCarServiceImpl() {
		return marketCarServiceImpl;
	}
	public void setMarketCarServiceImpl(MarketCarServiceImpl marketCarServiceImpl) {
		this.marketCarServiceImpl = marketCarServiceImpl;
	}
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	public List<MarketCar> getMarketCarList() {
		return marketCarList;
	}
	public void setMarketCarList(List<MarketCar> marketCarList) {
		this.marketCarList = marketCarList;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getAllPrice() {
		return allPrice;
	}


	public void setAllPrice(float allPrice) {
		this.allPrice = allPrice;
	}
	
	
	
}
