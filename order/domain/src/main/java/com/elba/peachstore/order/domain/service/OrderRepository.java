package com.elba.peachstore.order.domain.service;

import com.elba.peachstore.order.domain.aggregate.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
