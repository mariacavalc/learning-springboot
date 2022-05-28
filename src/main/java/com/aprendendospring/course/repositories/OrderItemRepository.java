package com.aprendendospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
