package com.lsj.market.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Flower {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private float price=0;
	@ManyToOne(fetch=FetchType.EAGER,targetEntity=FlowersCate.class)
	@JoinColumn(name="flowersCateId",nullable=true)
	private FlowersCate flowersCate;
	@Column
	private String pictrueName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public FlowersCate getFlowersCate() {
		return flowersCate;
	}
	public void setFlowersCate(FlowersCate flowersCate) {
		this.flowersCate = flowersCate;
	}
	public String getPictrueName() {
		return pictrueName;
	}
	public void setPictrueName(String pictrueName) {
		this.pictrueName = pictrueName;
	}

}
