package com.elba.peachstore.order.domain.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XOPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        log.info("XO Pay");
    }
}
