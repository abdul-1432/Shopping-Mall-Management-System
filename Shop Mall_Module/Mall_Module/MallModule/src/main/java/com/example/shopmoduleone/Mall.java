package com.example.shopmoduleone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mall 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mall_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MallAdmin mall_admin;
	private String mall_name;
	private String mall_location;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Shop mall_shopid;
	
	private String mall_categories;
	
	
	
	public Long getMall_id() {
		return mall_id;
	}
	public void setMall_id(Long mall_id) {
		this.mall_id = mall_id;
	}
	public MallAdmin getMall_admin() {
		return mall_admin;
	}
	public void setMall_admin(MallAdmin mall_admin) {
		this.mall_admin = mall_admin;
	}
	public String getMall_name() {
		return mall_name;
	}
	public void setMall_name(String mall_name) {
		this.mall_name = mall_name;
	}
	public String getMall_location() {
		return mall_location;
	}
	public void setMall_location(String mall_location) {
		this.mall_location = mall_location;
	}
	public Shop getMall_shopid() {
		return mall_shopid;
	}
	public void setMall_shopid(Shop mall_shopid) {
		this.mall_shopid = mall_shopid;
	}
	public String getMall_categories() {
		return mall_categories;
	}
	public void setMall_categories(String mall_categories) {
		this.mall_categories = mall_categories;
	}
	
	
	
	public Mall(Long mall_id, MallAdmin mall_admin, String mall_name, String mall_location, Shop mall_shopid,
			String mall_categories) {
		super();
		this.mall_id = mall_id;
		this.mall_admin = mall_admin;
		this.mall_name = mall_name;
		this.mall_location = mall_location;
		this.mall_shopid = mall_shopid;
		this.mall_categories = mall_categories;
	}
	
	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Mall [mall_id=" + mall_id + ", mall_admin=" + mall_admin + ", mall_name=" + mall_name
				+ ", mall_location=" + mall_location + ", mall_shopid=" + mall_shopid + ", mall_categories="
				+ mall_categories + "]";
	}
	
	
	

}