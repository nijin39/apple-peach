package com.elba.peachstore.order.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("local")
@Component
public class OrderVerifierMockWithMember implements OrderVerifierWithMember{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public boolean canOrder(String memberId) {
        if( memberId.equals("001")) {
            //TODO Rest call
            return false;
        } else {
            return true;
        }
    }
}
