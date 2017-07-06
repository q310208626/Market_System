package com.lsj.market.action.flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GetFlowerInfoAction extends ActionSupport{
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	private List<Flower> flowerList;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<Flower> tempFlowerList=new ArrayList<Flower>();
			tempFlowerList=goodsServiceImpl.getAllFlower();
			setFlowerList(tempFlowerList);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
		
		
	}
	
	
	public List<Flower> getFlowerList() {
		return flowerList;
	}

	public void setFlowerList(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}



	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}

	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}

}
