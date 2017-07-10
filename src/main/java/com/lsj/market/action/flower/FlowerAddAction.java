package com.lsj.market.action.flower;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.EscapedErrors;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerAddAction extends ActionSupport{
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private Flower flower;
	
	//商品图片
	private File flowerimage;
	private String flowerimageFileName;
	private String flowerimageContentType;
	private String savePath;
	//商品种类
	private int cateId=-1;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String newFileNameString=saveUploadImages(flowerimage,flowerimageFileName,flowerimageContentType);
		if(newFileNameString!=null) getFlower().setPictrueName(newFileNameString);
		try {
			if(!(cateId>0)){//种类选择未知
				int flowerid=(int) goodsServiceImpl.addFlower(flower);
				if (flowerid>0) {
					return SUCCESS;
				}else{
					return ERROR;
				}
			}else {
				FlowersCate flowersCate=goodsCateServiceImpl.getFlowersCateById(cateId);
				//如果种类存在
				if(flowersCate!=null){
					
					try {
						flower.setFlowersCate(flowersCate);
						goodsServiceImpl.addFlower(flower);
						return SUCCESS;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return ERROR;
					}
				}else{
					//商品种类不存在则直接添加花
					int flowerid=(int) goodsServiceImpl.addFlower(flower);
					if (flowerid>0) {
						return SUCCESS;
					}
					return ERROR;
				}
			}	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
	}
	
	public String saveUploadImages(File uploadImage,String imageName,String ContentType){
		String newImageName="";
		if(uploadImage!=null){
			if(imageName!=null&&!imageName.isEmpty()){
				Date uploadDate=new Date();
				SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
				newImageName=sdf.format(uploadDate)+imageName;
				String realPath=savePath;
				
				File saveFile=new File(realPath, newImageName);
				if(!saveFile.getParentFile().exists()){
					saveFile.getParentFile().mkdirs();
				}
				
				try {
					FileUtils.copyFile(uploadImage,saveFile);
					return newImageName;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return null;
				}
			}
		}
		return null;
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

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}

	public File getFlowerimage() {
		return flowerimage;
	}

	public void setFlowerimage(File flowerimage) {
		this.flowerimage = flowerimage;
	}

	public String getFlowerimageFileName() {
		return flowerimageFileName;
	}

	public void setFlowerimageFileName(String flowerimageFileName) {
		this.flowerimageFileName = flowerimageFileName;
	}

	public String getFlowerimageContentType() {
		return flowerimageContentType;
	}

	public void setFlowerimageContentType(String flowerimageContentType) {
		this.flowerimageContentType = flowerimageContentType;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
}
