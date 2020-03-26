package com.wildcards.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcards.models.Inventory;

@Repository
public interface InventoryDao extends JpaRepository<Inventory, Integer>{

	public List<Inventory> findByTypeTypeId(int typeId); 
}
