package com.lsj.market.action.flower;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerCateAddAction extends ActionSupport{
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private FlowersCate flowerCate;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		int flowerId=0;
		try {
			if (flowerCate.getCategory()==null||flowerCate.getCategory().equals("")) {
				return ERROR;
			}
			FlowersCate tempFlowersCate=getFlowerCate();
			flowerId=(Integer)goodsCateServiceImpl.addFlowerCate(tempFlowersCate);
			System.out.println(flowerId);
			if(flowerId>0){
				return SUCCESS;
			}else{
				return ERROR;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
		
	}

	
	
	public GoodsCateServiceImpl getGoodsCateServiceImpl() {
		return goodsCateServiceImpl;
	}



	public void setGoodsCateServiceImpl(GoodsCateServiceImpl goodsCateServiceImpl) {
		this.goodsCateServiceImpl = goodsCateServiceImpl;
	}



	public FlowersCate getFlowerCate() {
		return flowerCate;
	}
	public void setFlowerCate(FlowersCate flowerCate) {
		this.flowerCate = flowerCate;
	}

	
}
