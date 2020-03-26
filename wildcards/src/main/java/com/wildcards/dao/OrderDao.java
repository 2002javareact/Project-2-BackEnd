package com.wildcards.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcards.models.Order;;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer>{


}
