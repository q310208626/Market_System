package com.lsj.market.action.flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ToFlowerUpdateAction extends ActionSupport{
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private List<Flower> flowerList;
	private String savePath;
	private List<FlowersCate> cateList;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<Flower> tempFlowerList=new ArrayList<Flower>();
			tempFlowerList=goodsServiceImpl.getAllFlower();
			setFlowerList(tempFlowerList);
			List<FlowersCate>  tempCateList=new ArrayList<FlowersCate>();
			tempCateList=goodsCateServiceImpl.queryAllFlowersCates();
			setCateList(tempCateList);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}	
	}
	public GoodsServiceImpl getGoodsServiceImpl() {
		return goodsServiceImpl;
	}
	public void setGoodsServiceImpl(GoodsServiceImpl goodsServiceImpl) {
		this.goodsServiceImpl = goodsServiceImpl;
	}
	public GoodsCateServiceImpl getGoodsCateServiceImpl() {
		return goodsCateServiceImpl;
	}
	public void setGoodsCateServiceImpl(GoodsCateServiceImpl goodsCateServiceImpl) {
		this.goodsCateServiceImpl = goodsCateServiceImpl;
	}
	public List<Flower> getFlowerList() {
		return flowerList;
	}
	public void setFlowerList(List<Flower> flowerList) {
		this.flowerList = flowerList;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public List<FlowersCate> getCateList() {
		return cateList;
	}
	public void setCateList(List<FlowersCate> cateList) {
		this.cateList = cateList;
	}
	

}
