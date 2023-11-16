package com.example.shopmoduleone;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController 
{
	@Autowired
	private CustomerService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/customer")
	public List<Customer> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/customer/{customer_id}")
	public ResponseEntity<Customer> get(@PathVariable Integer customer_id)
	{
		try
		{
			Customer customer = service.get(customer_id);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/customer")
	public void add(@RequestBody Customer customer)
	{
		service.save(customer);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/customer/{customer_id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer customer_id)
	{
		try
		{
			Customer customer2 = service.get(customer_id);
			service.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/customer/{customer_id}")
	public void delete(@PathVariable Integer customer_id)
	{
	service.delete(customer_id);
	}

}

