package com.lsj.market.action.flower;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerCateDeleteAction extends ActionSupport{
	@Autowired
	private  GoodsCateServiceImpl goodsCateServiceImpl;
	
	private FlowersCate flowersCate;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(flowersCate.getId());
		
			goodsCateServiceImpl.deleteFlowerCate(flowersCate.getId());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	public FlowersCate getFlowersCate() {
		return flowersCate;
	}
	public void setFlowersCate(FlowersCate flowersCate) {
		this.flowersCate = flowersCate;
	}
	public GoodsCateServiceImpl getGoodsCateServiceImpl() {
		return goodsCateServiceImpl;
	}
	public void setGoodsCateServiceImpl(GoodsCateServiceImpl goodsCateServiceImpl) {
		this.goodsCateServiceImpl = goodsCateServiceImpl;
	}
	
	
}
