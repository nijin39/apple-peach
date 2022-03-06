package com.elba.peachstore.order.domain.aggregate.strategy;

import com.elba.peachstore.order.valueobject.MemberInfo;

public interface MemberCheckStrategy {
    boolean canOrder(MemberInfo memberInfo);
}
