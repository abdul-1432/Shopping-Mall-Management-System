package com.example.shopmoduleone;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ItemServicesService 
{
	@Autowired
	private ItemServicesRepository repo;
	
	public List<ItemServices> listAll()
	{
		return repo.findAll();
	}
	
	public void save(ItemServices itemservices)
	{
		repo.save(itemservices);
	}
	
	public ItemServices get(Integer item_id)
	{
		return repo.findById(item_id).get();
	}
	public void delete(Integer item_id)
	{
		repo.deleteById(item_id);
	}
}