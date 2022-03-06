package com.elba.peachstore.order.domain.service;

import com.elba.peachstore.order.domain.aggregate.Orderer;

public interface MemberRepository {
    Orderer findByMemberId(String memberId);
}
