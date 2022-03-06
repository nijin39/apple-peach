package com.elba.peachstore.order;

import com.elba.peachstore.order.domain.aggregate.EGiftCardOrder;
import com.elba.peachstore.order.domain.aggregate.Order;
import com.elba.peachstore.order.domain.StarbucksCard;
import com.elba.peachstore.order.domain.StarbucksCardRepository;
import com.elba.peachstore.order.domain.aggregate.Orderer;
import com.elba.peachstore.order.domain.aggregate.strategy.MemberCheckStrategy;
import com.elba.peachstore.order.domain.aggregate.strategy.WholeCakeMemberCheck;
import com.elba.peachstore.order.domain.commands.PlaceOrderCommand;
import com.elba.peachstore.order.domain.model.CreateOrderCommand;
import com.elba.peachstore.order.domain.service.MemberRepository;
import com.elba.peachstore.order.domain.service.OrderVerifierWithMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceOrderService {

    private Fiserve fiserve;
    private OrderVerifierWithMember orderVerifierWithMember;
    private StarbucksCardRepository starbucksCardRepository;
    private MemberRepository memberRepository;

    public Order placeOrder(PlaceOrderCommand placeOrderCommand) throws Exception {
//        if( placeOrderRequest.getOrderName().equals("002")) {
//            throw new Exception("그냥 기분 나쁘다...");
//        }
//
//        StarbucksCardDto starbucksCardDto = starbucksCardRepository.findByCardId("0001");
//        StarbucksCard starbucksCard = StarbucksFactory.create(starbucksCardDto);
//
//
//        StarbucksCard starbucksCard;
//        starbucksCard.placeOrder(placeOrderCommand placeOrderCommand);
//
//        StarbucksCardRepository.save(new StarbucksCardDto(startsCard));


        //Order order = (Egift / WholeCake) orderRepository.findById("001"); //types 1,2,3
        // Order order = (Egift / WholeCake) orderFactory.create(placeOrder)
        // 만들어야 한다. Factory를 사용하시면 됩니다. Factory Method
        // Entity를 생성한 경우에도 타입이 생성이 되어지게 될 것입니다.
        // order instanceOf EGift == true;
        // mappedbySuper class
        // 인헤리턴스..

        Order order = new EGiftCardOrder();
        order.createOrder(orderVerifierWithMember, new PlaceOrderCommand("0001", 1000, null));

        //1 ----------------------------------------------------------------------------------------------------

        Orderer orderer = memberRepository.findByMemberId("0001");
        orderer.setMemberCheckStrategy(createStragey("001"));

        boolean canOrderStatus = orderer.canOrder();
        if( canOrderStatus ) {
            order.createOrder(new PlaceOrderCommand("0001", 1000, null));
        }

        //2 ----------------------------------------------------------------------------------------------------
        //EGiftCard / WholeCake
        Orderer orderer2 = memberRepository.findByMemberId("0001");

        if( canOrderStatus ) {
            order.createOrder(new PlaceOrderCommand("0001", 1000, orderer2));
        }

        //3 ----------------------------------------------------------------------------------------------------


        //OrderDto order1dto = /Egift /Whole orderRepository.findbyid();
        //Order order = OrderDto.toAggrate();
        //Order order = OrderFactory.create(orderDto);

        return null;
    }

    private MemberCheckStrategy createStragey(String s) {
        if( s.equals("0001")) {
            return new WholeCakeMemberCheck();
        }
        return null;
    }

    public ActivateResponse activate(List<ActivateRequest> activateRequests) {


        activateRequests.forEach(activateRequest -> {
            StarbucksCard starbucksCard = cardRepository.findByOrderNo(activateRequest.getOrderNo());
            // EGiftCard
            starbucksCard.activate(activateRequest.getAmount(), fiserve);
        });

        return null;
    }

    @Data
    @AllArgsConstructor
    public static class PlaceOrderRequest {
        private String orderName;
    }

    @Data
    @AllArgsConstructor
    public static class PlaceOrderResponse {
        private List<OrderItem> orderItems;
    }

    @Data
    @AllArgsConstructor
    public static class ActivateRequest {
        private String orderNo;
        private Integer amount;
    }

    @Data
    @AllArgsConstructor
    public static class ActivateResponse {
        private String orderNo;
    }
}
