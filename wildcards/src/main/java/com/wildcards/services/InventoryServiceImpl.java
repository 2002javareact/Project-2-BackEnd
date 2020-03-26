package com.wildcards.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wildcards.dao.InventoryDao;
import com.wildcards.models.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService{

	
	private InventoryDao id;
	
	@Autowired
	public InventoryServiceImpl(InventoryDao id) {
		this.id =id;
	}
	
	@Override
	public List<Inventory> getAllInventory() {
		return id.findAll();
	}
	
	@Override
	public Inventory createNewItem(Inventory i ) {
		// TODO Auto-generated method stub
		return id.save(i);
	}

	@Override
	public List<Inventory> getByTypeId(int typeId) {
		// TODO Auto-generated method stub
		return id.findByTypeTypeId(typeId);
	}
}
