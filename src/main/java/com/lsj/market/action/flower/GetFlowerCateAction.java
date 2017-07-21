package com.lsj.market.action.flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class GetFlowerCateAction extends ActionSupport{
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private List<FlowersCate> flowersCateList;
	private List<FlowersCate> tempList;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		try {
			tempList=goodsCateServiceImpl.queryAllFlowersCates();
			setFlowersCateList(tempList);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
			return ERROR;
		}
		
		
	}
	
	public String indexExecute() throws Exception{
		try {
			tempList=goodsCateServiceImpl.queryAllFlowersCates();
			setFlowersCateList(tempList);
			return SUCCESS;
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

	public List<FlowersCate> getFlowersCateList() {
		return flowersCateList;
	}

	public void setFlowersCateList(List<FlowersCate> flowersCateList) {
		this.flowersCateList = flowersCateList;
	}
	
}
