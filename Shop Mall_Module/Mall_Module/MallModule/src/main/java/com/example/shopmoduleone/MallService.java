package com.example.shopmoduleone;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MallService 
{
	@Autowired
	private MallRepository repo;
	
	public List<Mall> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Mall mall)
	{
		repo.save(mall);
	}
	
	public Mall get(Long mall_id)
	{
		return repo.findById(mall_id).get();
	}
	public void delete(Long mall_id)
	{
		repo.deleteById(mall_id);
	}
}

