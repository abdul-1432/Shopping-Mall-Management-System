package com.example.shopmoduleone;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemServices 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long item_id;
	private String item_name;
	private LocalDate item_manufacturing;
	private LocalDate item_expiry;
	private Float item_price;
	private String item_category;
	
	
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public LocalDate getItem_manufacturing() {
		return item_manufacturing;
	}
	public void setItem_manufacturing(LocalDate item_manufacturing) {
		this.item_manufacturing = item_manufacturing;
	}
	public LocalDate getItem_expiry() {
		return item_expiry;
	}
	public void setItem_expiry(LocalDate item_expiry) {
		this.item_expiry = item_expiry;
	}
	public Float getItem_price() {
		return item_price;
	}
	public void setItem_price(Float item_price) {
		this.item_price = item_price;
	}
	public String getItem_category() {
		return item_category;
	}
	public void setItem_category(String item_category) {
		this.item_category = item_category;
	}
	
	
	public ItemServices(Long item_id, String item_name, LocalDate item_manufacturing, LocalDate item_expiry, Float item_price,
			String item_category) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_manufacturing = item_manufacturing;
		this.item_expiry = item_expiry;
		this.item_price = item_price;
		this.item_category = item_category;
	}
	
	
	public ItemServices() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_manufacturing=" + item_manufacturing
				+ ", item_expiry=" + item_expiry + ", item_price=" + item_price + ", item_category=" + item_category
				+ "]";
	}
	
	
}