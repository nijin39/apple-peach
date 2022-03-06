package com.elba.peachstore.order.domain.service;

public interface OrderVerifierWithMember {
    boolean canOrder(String memberId);
}
