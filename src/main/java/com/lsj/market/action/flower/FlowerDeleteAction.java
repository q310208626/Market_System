package com.lsj.market.action.flower;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerDeleteAction extends ActionSupport{
	private Flower flower;
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Flower tempFlower=null;
		tempFlower=goodsServiceImpl.queryFlowerById(getFlower().getId());
		if(tempFlower!=null){
			try {
				goodsServiceImpl.deleteFlower(getFlower().getId());
				return SUCCESS;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return ERROR;
			}
			
		}
		return ERROR;
	}
	
	public Flower getFlower() {
		return flower;
	}
	public void setFlower(Flower flower) {
		this.flower = flower;
	}

	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}

	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}	

}
