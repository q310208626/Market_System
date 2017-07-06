package com.lsj.market.action.flower;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerAddAction extends ActionSupport{
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	private Flower flower;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int flowerid=(int) goodsServiceImpl.addFlower(flower);
		if (flowerid>0) {
			return SUCCESS;
		}
		return ERROR;
	}

	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}

	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}
	
}
