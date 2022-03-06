package com.elba.peachstore.order.infrastructure.infrastructure;

import com.elba.peachstore.order.domain.dto.OrderDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJPARespository extends JpaRepository<OrderDto, Long> {
}
