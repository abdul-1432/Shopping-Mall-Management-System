package com.example.shopmoduleone;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_id;
	private String customername;
	private String customer_email;
	private Integer phone_no;
	
	@OneToOne(cascade = CascadeType.ALL)
	private OrderDetails orderdetails;

	
	
	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public Integer getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}

	public OrderDetails getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Customer(Integer customer_id, String customername, String customer_email, Integer phone_no,
			OrderDetails orderdetails) {
		super();
		this.customer_id = customer_id;
		this.customername = customername;
		this.customer_email = customer_email;
		this.phone_no = phone_no;
		this.orderdetails = orderdetails;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customername=" + customername + ", customer_email="
				+ customer_email + ", phone_no=" + phone_no + ", orderdetails=" + orderdetails + "]";
	}
	
	
}
