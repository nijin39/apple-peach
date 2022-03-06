package com.elba.peachstore.order.domain.model;

import com.elba.peachstore.order.domain.aggregate.Orderer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateOrderCommand {
    private String memberId;
    private Integer payAmount;
    private Orderer merber;
}
