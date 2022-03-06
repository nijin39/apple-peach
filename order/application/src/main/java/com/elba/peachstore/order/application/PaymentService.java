package com.elba.peachstore.order.application;

import com.elba.peachstore.order.domain.payment.Payment;
import com.elba.peachstore.order.domain.payment.XOPayment;
import com.elba.peachstore.order.domain.payment.XOPaymentStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PaymentService {

    public static void pay() {

        Payment payment = new XOPayment(new XOPaymentStrategy());
        payment.pay();

    }

    public static void main(String[] args) {
        pay();
    }
}
