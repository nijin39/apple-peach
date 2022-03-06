package com.elba.peachstore.order.domain.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class OrderVerifierRealWithMember implements OrderVerifierWithMember{
    @Override
    public boolean canOrder(String memberId) {
        if( memberId.equals("001")) {
            return false;
        } else {
            return true;
        }
    }
}
