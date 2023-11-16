package com.example.shopmoduleone;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
	public List<Customer> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Customer customer)
	{
		repo.save(customer);
	}
	
	public Customer get(Integer customer_id)
	{
		return repo.findById(customer_id).get();
	}
	public void delete(Integer customer_id)
	{
		repo.deleteById(customer_id);
	}
}
