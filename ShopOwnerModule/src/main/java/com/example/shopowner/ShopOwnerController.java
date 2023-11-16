package com.example.shopowner;

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
public class ShopOwnerController 
{
	@Autowired
	private ShopOwnerService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/shopowner")
	public List<ShopOwner> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/shopowner/{shopowner_id}")
	public ResponseEntity<ShopOwner> get(@PathVariable Integer shopowner_id)
	{
		try
		{
			ShopOwner shopowner = service.get(shopowner_id);
			return new ResponseEntity<ShopOwner>(shopowner, HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/shopowner")
	public void add(@RequestBody ShopOwner shopowner)
	{
		service.save(shopowner);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/shopowner/{shopowner_id}")
	public ResponseEntity<?> update(@RequestBody ShopOwner shopowner, @PathVariable Integer shopowner_id)
	{
		try
		{
			ShopOwner shopowner2 = service.get(shopowner_id);
			service.save(shopowner);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/shopowner/{shopowner_id}")
	public void delete(@PathVariable Integer shopowner_id)
	{
	service.delete(shopowner_id);
	System.out.println("Deleted Successfully");
	}

}
