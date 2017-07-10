package com.lsj.market.action.flower;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ToFlowerAddAction extends ActionSupport{
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private List<FlowersCate> cateList=new ArrayList<FlowersCate>();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			cateList=goodsCateServiceImpl.queryAllFlowersCates();
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
	public List<FlowersCate> getCateList() {
		return cateList;
	}
	public void setCateList(List<FlowersCate> cateList) {
		this.cateList = cateList;
	}
}
