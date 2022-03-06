package com.elba.peachstore.order.domain.aggregate.strategy;

import com.elba.peachstore.order.valueobject.MemberInfo;

public class EGiftMemberCheck implements MemberCheckStrategy{

    @Override
    public boolean canOrder(MemberInfo memberInfo) {
        return false;
    }
}
