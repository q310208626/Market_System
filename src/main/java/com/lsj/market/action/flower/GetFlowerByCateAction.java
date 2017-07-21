package com.lsj.market.action.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GetFlowerByCateAction extends ActionSupport{
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	private List<Flower> flowerList;
	private int cateId;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			flowerList=goodsServiceImpl.getFlowerByCate(cateId);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
	}
	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}
	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public List<Flower> getFlowerList() {
		return flowerList;
	}
	public void setFlowerList(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}
	
}
