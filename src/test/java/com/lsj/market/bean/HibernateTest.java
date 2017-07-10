package com.lsj.market.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Log4jConfigurer;

import com.lsj.market.bean.Flower;
import com.lsj.market.bean.FlowersCate;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class HibernateTest {
	/*Logger logger=Logger.getLogger(this.getClass());
	static{
		try {
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Log4j Init Failed");
			e.printStackTrace();
		}
	}*/
	@Autowired
	private SessionFactory sessionFactory;
	
	File flowerPicture;
	String flowerPictureFileName;
	String flowerPictureContentType;
	String savePath="/home/hdmi/Pictures/uploadImages";
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	
	@Before
	public void before() {
		flowerPicture=new File("/home/hdmi/Pictures/7495886aa4d11968cf7135bcd7023c72.jpg");
		flowerPictureFileName=flowerPicture.getName();
		int lastDod=flowerPictureFileName.lastIndexOf('.');
		flowerPictureContentType=flowerPictureFileName.substring(lastDod, flowerPictureFileName.length());
		System.out.println(flowerPictureFileName);
		System.out.println(flowerPictureContentType);
	}


	@Test
	public void test() {
		String newFileNameString=saveUploadImages(flowerPicture,flowerPictureFileName,flowerPictureContentType);
		System.out.println(newFileNameString);
	}

	@After
	public void after() {	
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

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}	
}
