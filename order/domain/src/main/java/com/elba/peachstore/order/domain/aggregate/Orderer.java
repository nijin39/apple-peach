package com.elba.peachstore.order.domain.aggregate;

import com.elba.peachstore.order.domain.aggregate.strategy.MemberCheckStrategy;
import com.elba.peachstore.order.valueobject.MemberInfo;
import com.elba.peachstore.order.valueobject.OutableOrderInfo;



// Strategy(Orderer order)
// ~~~~~~` canOrder(Orderer order) {
// if( 14 < order.getAge() ) {
//
// }
// }

// Strategy(Orderer order)
// ~~~~~~` canOrder(Orderer order) {
// if( 14 < orderer.getAge() ) {
//
// }
// }

// Strategy(Orderer order)
// ~~~~~~` canOrder(Orderer order) {
// if( 14 < orderer.getAge() ) {
//
// }
// }
// DB에서 가져오는게 아니니까...
public class Orderer {

    private MemberCheckStrategy memberCheckStrategy;

    private String memberId;

    private String citizenNo;

    private OutableOrderInfo outableOrderInfo;

    private MemberInfo memberInfo;

    public void setMemberCheckStrategy(MemberCheckStrategy memberCheckStrategy) {
        this.memberCheckStrategy = memberCheckStrategy;
    }

    public boolean canOrder() {
        return memberCheckStrategy.canOrder(memberInfo);
    }
}
