package com.elba.peachstore.order.domain.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XOPayment extends Payment{
    public XOPayment(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void pay() {
        log.info("XO pay");
    }
}
