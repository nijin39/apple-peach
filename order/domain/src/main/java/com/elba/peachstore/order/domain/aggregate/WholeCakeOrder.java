package com.elba.peachstore.order.domain.aggregate;

public class WholeCakeOrder extends Order {
    @Override
    public boolean checkPayAmout(Integer payAmount) {
        if( payAmount < 40000 ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkMember(Orderer orderer) {
        // 아무나 주문할 수 있어.
        return true;
    }
}
