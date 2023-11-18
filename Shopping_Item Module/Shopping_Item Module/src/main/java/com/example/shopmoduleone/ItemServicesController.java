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
public class ItemServicesController 
{
	@Autowired
	private ItemServicesService service;
	
	// RESTful API methods for Retrieval operations
	@GetMapping("/itemservices")
	public List<ItemServices> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/itemservices/{item_id}")
	public ResponseEntity<ItemServices> get(@PathVariable Integer item_id)
	{
		try
		{
			ItemServices itemservices = service.get(item_id);
			return new ResponseEntity<ItemServices>(itemservices, HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<ItemServices>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Create operation
	@PostMapping("/itemservices")
	public void add(@RequestBody ItemServices itemservices)
	{
		service.save(itemservices);
	}
	
	// RESTful API method for Update operation
	@PutMapping("/itemservices/{item_id}")
	public ResponseEntity<?> update(@RequestBody ItemServices itemservices, @PathVariable Integer item_id)
	{
		try
		{
			ItemServices itemservices1 = service.get(item_id);
			service.save(itemservices1);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// RESTful API method for Delete operation
	@DeleteMapping("/itemservices/{item_id}")
	public void delete(@PathVariable Integer item_id)
	{
		service.delete(item_id);
	}

}



