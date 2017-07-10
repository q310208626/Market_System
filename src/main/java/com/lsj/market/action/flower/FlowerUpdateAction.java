package com.lsj.market.action.flower;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;
import com.lsj.market.service.impl.GoodsCateServiceImpl;
import com.lsj.market.service.impl.GoodsServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class FlowerUpdateAction extends ActionSupport {
	@Autowired
	private GoodsServiceImpl goodsServiceImpl;
	@Autowired
	private GoodsCateServiceImpl goodsCateServiceImpl;
	private Flower flower;

	// 商品图片
	private File flowerimage;
	private String flowerimageFileName;
	private String flowerimageContentType;
	private String savePath;
	// 商品种类
	private int cateId = -1;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		// 如果name不为空,价格不是负数
		if (flower.getName() != null&&flower.getPrice()>=0) {
			Flower tempFlower = goodsServiceImpl
					.queryFlowerById(flower.getId());
			// 如果商品id存在，继续
			if (tempFlower != null) {
				//复制从网页得来的基本信息
				flowerInfoCopy(flower, tempFlower);
				// 如果图片不为空，则上传了图片，需要更新，创建图片名对象
				String newPictrueName = null;
				if (flowerimage != null) {
					newPictrueName = saveUploadImages(flowerimage,
							flowerimageFileName, flowerimageContentType);
				}
				
				// 如果id为-1，则选择种类未知
				if (!(cateId > 0)) {
					try {
						//新图片不为空
						if (newPictrueName != null){
							if(tempFlower.getPictrueName()!=null&&!tempFlower.getPictrueName().isEmpty()){
								deletePicture(savePath,tempFlower.getPictrueName());
							}
							tempFlower.setPictrueName(newPictrueName);
						}
							
						tempFlower.setFlowersCate(null);
						goodsServiceImpl.updateFlower(tempFlower);
						return SUCCESS;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return ERROR;
					}

				}
				// cateid不为负数，则选择了种类
				else {
					FlowersCate tempFlowerCate=null;
					tempFlowerCate = goodsCateServiceImpl.getFlowersCateById(cateId);
					try {
						//新图片不为空
						if (newPictrueName != null){
							if(tempFlower.getPictrueName()!=null&&!tempFlower.getPictrueName().isEmpty()){
								deletePicture(savePath,tempFlower.getPictrueName());
							}
							tempFlower.setPictrueName(newPictrueName);
						}
						//商品种类存在
						if(tempFlowerCate!=null) 
							tempFlower.setFlowersCate(tempFlowerCate);
							goodsServiceImpl.updateFlower(tempFlower);
						return SUCCESS;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						return ERROR;
					}
				}

			}
		}
		return ERROR;
	}

	public String saveUploadImages(File uploadImage, String imageName,
			String ContentType) {
		String newImageName = "";
		if (uploadImage != null) {
			if (imageName != null && !imageName.isEmpty()) {
				Date uploadDate = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
				newImageName = sdf.format(uploadDate) + imageName;
				String realPath = savePath;

				File saveFile = new File(realPath, newImageName);
				if (!saveFile.getParentFile().exists()) {
					saveFile.getParentFile().mkdirs();
				}

				try {
					FileUtils.copyFile(uploadImage, saveFile);
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
	
	//删除Flower对象原本的图片（用于图片更新）
	public void deletePicture(String pictureParentPath,String pictureName){
		File file=new File(pictureParentPath,pictureName);
		file.delete();
	}
	
	public void flowerInfoCopy(Flower src,Flower dest){
		dest.setName(src.getName());
		dest.setPrice(src.getPrice());
		dest.setFlowersCate(src.getFlowersCate());
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

	public void setGoodsCateServiceImpl(
			GoodsCateServiceImpl goodsCateServiceImpl) {
		this.goodsCateServiceImpl = goodsCateServiceImpl;
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

	public int getCateId() {
		return cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

}
