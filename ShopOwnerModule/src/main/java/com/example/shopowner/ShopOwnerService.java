package com.example.shopowner;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ShopOwnerService 
{
	@Autowired
	private ShopOwnerRepository repo;
	
	public List<ShopOwner> listAll()
	{
		return repo.findAll();
	}
	
	public void save(ShopOwner shopowner)
	{
		repo.save(shopowner);
	}
	
	public ShopOwner get(Integer shopowner_id)
	{
		return repo.findById(shopowner_id).get();
	}
	public void delete(Integer shopowner_id)
	{
		repo.deleteById(shopowner_id);
	}
}

