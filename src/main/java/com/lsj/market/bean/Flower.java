package com.lsj.market.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Flower {
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private float price;
	@Column
	
	private FlowersCate flowersCate;
	@Column
	private String pictrueUrl;
	
}
