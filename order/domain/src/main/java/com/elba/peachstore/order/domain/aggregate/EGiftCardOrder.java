package com.elba.peachstore.order.domain.aggregate;

public class EGiftCardOrder extends Order {

    @Override
    public boolean checkPayAmout(Integer payAmount) {
        if( payAmount < 10000 ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkMember(Orderer orderer) {
        // 14세 이상만 주문해야되....
        return false;
    }
}
