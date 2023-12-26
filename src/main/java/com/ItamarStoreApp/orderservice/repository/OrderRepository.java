package com.ItamarStoreApp.orderservice.repository;

import com.ItamarStoreApp.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
