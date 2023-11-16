package com.example.shopowner;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShopOwner 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopowner_id;
	private String shopowner_name;
	private LocalDate shopowner_dob;
	private String shopowner_address;

	
	
	public Integer getShopowner_id() {
		return shopowner_id;
	}
	public void setShopowner_id(Integer shopowner_id) {
		this.shopowner_id = shopowner_id;
	}
	public String getShopowner_name() {
		return shopowner_name;
	}
	public void setShopowner_name(String shopowner_name) {
		this.shopowner_name = shopowner_name;
	}
	public LocalDate getShopowner_dob() {
		return shopowner_dob;
	}
	public void setShopowner_dob(LocalDate shopowner_dob) {
		this.shopowner_dob = shopowner_dob;
	}
	public String getShopowner_address() {
		return shopowner_address;
	}
	public void setShopowner_address(String shopowner_address) {
		this.shopowner_address = shopowner_address;
	}
	
	public ShopOwner(Integer shopowner_id, String shopowner_name, LocalDate shopowner_dob, String shopowner_address) {
		this.shopowner_id = shopowner_id;
		this.shopowner_name = shopowner_name;
		this.shopowner_dob = shopowner_dob;
		this.shopowner_address = shopowner_address;
		
	}
	
	
	public ShopOwner() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "ShopOwner [shopowner_id=" + shopowner_id + ", shopowner_name=" + shopowner_name + ", shopowner_dob="
				+ shopowner_dob + ", shopowner_address=" + shopowner_address + "]";
	}
	
}