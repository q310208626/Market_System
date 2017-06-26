package com.lsj.market.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



/** 
* @ClassName: User 
* @Description: 用户基本信息
* @author hdmi
* @date Jun 22, 2017 7:56:59 PM 
*  
*/
@Component
@Table(name="user")
@Entity
public class User {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="account")
	private String account;
	@Column(name="password")
	private String password;
	@Column(name="role",columnDefinition="int default 1")
	private int role=1;
	@OneToOne(cascade=CascadeType.ALL,targetEntity=UserDetail.class,fetch=FetchType.EAGER)
	private UserDetail userDetail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	
	
}
