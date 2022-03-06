package com.elba.peachstore.order.domain.aggregate;

import com.elba.peachstore.order.domain.commands.CancelOrderCommand;
import com.elba.peachstore.order.domain.commands.CompleteOrderCommand;
import com.elba.peachstore.order.domain.commands.PlaceOrderCommand;
import com.elba.peachstore.order.domain.model.CreateOrderCommand;
import com.elba.peachstore.order.domain.service.OrderVerifierWithMember;
import com.elba.peachstore.order.valueobject.OrderInfo;
import com.elba.peachstore.order.valueobject.Shopper;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

// Abstract 어느 경우의 모델링을 할 때 사용하나요?
// EGiftCardOrder is kind of Order.
// Order / EGiftCardOrder / WholeCakeOrder

// Interface can do this
// OrderJpaRespoitory can do save, findbyid


@Entity
@Data
public abstract class Order {

    @Id
    private String orderId;

    private OrderInfo orderInfo;

    private Shopper shopper;

    public void createOrder(OrderVerifierWithMember orderVerifierWithMember, PlaceOrderCommand placeOrderCommand) {
        checkPayAmout(placeOrderCommand.getPayAmount());
        //01. member를 확인한다.
        boolean canOrder = orderVerifierWithMember.canOrder(placeOrderCommand.getMemberId());
        //02. 주문정보를 생성한다.
        if( canOrder ) {
            this.orderInfo = new OrderInfo();
        }
    }

    // Teamplete
    public void createOrder(PlaceOrderCommand placeOrderCommand) throws Exception {
            this.orderInfo.checkOderInfo();
            this.checkMember(placeOrderCommand.getMerber());
            this.orderInfo = new OrderInfo();
    }

    public Order completeOrder(CompleteOrderCommand completeOrderCommand){
        return null;
    }

    public void cancelOrder(CancelOrderCommand cancelOrderCommand) {
            // 같이 해야 되는 부분은 여기에
            // 달라지는 부분은 요기에 이놈은 abstract로
    }

    public abstract void settingPaymentStreategy();
    public abstract boolean checkPayAmout(Integer payAmount);
    public abstract boolean checkMember(Orderer orderer);
}
