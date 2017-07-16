package com.lsj.market.bean;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

/**
 * @ClassName MarketCar
 * @author hdmi
 * @Date Jul 11, 20177:42:11 PM
 * @Description 相当于简化的订单，与用户相关联，但还没被购买
 */
@Entity
@Table(name="marketcar")
@Component
public class MarketCar {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch=FetchType.EAGER,targetEntity=User.class)
	@JoinColumn(name="userId",nullable=false)
	private User user;
	@ManyToOne(fetch=FetchType.EAGER,targetEntity=Flower.class)
	@JoinColumn(name="flowerId",nullable=false)
	private Flower flower;
	@Column
	private int goodNum;
	@Column
	private float totalPrice=0f;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Flower getFlower() {
		return flower;
	}
	public void setFlower(Flower flower) {
		this.flower = flower;
	}
	public int getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
