package com.lsj.market.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="flowersCateId",nullable=true)
	private FlowersCate flowersCate;
	@Column
	private String pictrueUrl;
	
}
