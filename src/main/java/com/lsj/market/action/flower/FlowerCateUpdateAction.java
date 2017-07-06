package com.lsj.market.action.flower;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerCateUpdateAction extends ActionSupport{
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	
	private FlowersCate flowersCate;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			goodsCateServiceImpl.updateCate(flowersCate);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}

	public GoodsCateServiceImpl getGoodsCateServiceImpl() {
		return goodsCateServiceImpl;
	}

	public void setGoodsCateServiceImpl(GoodsCateServiceImpl goodsCateServiceImpl) {
		this.goodsCateServiceImpl = goodsCateServiceImpl;
	}

	public FlowersCate getFlowersCate() {
		return flowersCate;
	}

	public void setFlowersCate(FlowersCate flowersCate) {
		this.flowersCate = flowersCate;
	}

}
