package com.elba.peachstore.order.domain.payment;

public abstract class Payment {
    private PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

//    public void pay() {
//        this.paymentStrategy.pay();
//    }

    public abstract void pay();
}
