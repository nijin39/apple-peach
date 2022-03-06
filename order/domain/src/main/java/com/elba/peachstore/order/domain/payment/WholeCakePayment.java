package com.elba.peachstore.order.domain.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WholeCakePayment extends Payment{
    public WholeCakePayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay() {
        log.info("WholeCake pay");
    }
}
