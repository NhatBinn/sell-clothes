package com.example.web.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
