package com.elba.peachstore.order.domain.commands;

import com.elba.peachstore.order.domain.aggregate.Orderer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlaceOrderCommand {
    private String memberId;
    private Integer payAmount;
    private Orderer merber;
}
