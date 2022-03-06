package com.elba.peachstore.order.interfaces.api;

import com.elba.peachstore.order.PlaceOrderService;
import com.elba.peachstore.order.domain.aggregate.Order;
import com.elba.peachstore.order.domain.commands.ActivateCommands;
import com.elba.peachstore.order.domain.commands.PlaceOrderCommand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private final PlaceOrderService placeOrderService;

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }

    // Controller DTO를 입력으로 받습니다. Data Transfer Object 이니까....
    // Controller 역할은 뭘까요? 외부호출을 받아주고 내부 서비스로 넘기는 역할(ACL)
    // 외부의 변화가 내부의 로직을 깨드리지 않게 하기 위해서 번역기의 역할만 수행합니다.
    // Command Aggregate가 받게 될 것이다.
    // Controller에서 받으로 내보낼 때는 DTO.
    // Member ( 주민등록번호, 이름, 생년월일, 멤버ID ) -> 다나가면 문제가 됩니다.
    // MeberResponseDto( 멤버ID ) 실어줍니다.
    @PostMapping("/placeOrder")
    public OrderResponseDto placeOrder(@RequestBody OrderRequestDto orderRequestDto) throws Exception {
        Order order = placeOrderService.placeOrder(orderRequestDto.createOrderCommand());
        return new OrderResponseDto(order);
    }

    @Data
    @NoArgsConstructor
    public static class OrderResponseDto {
        private String orderNo;

        public OrderResponseDto(Order order) {
            this.orderNo = order.getOrderId();
        }
    }

    @Data
    @NoArgsConstructor
    public static class OrderRequestDto {
        private String orderName;

        public PlaceOrderService.PlaceOrderRequest createOrderRequest() {
            return new PlaceOrderService.PlaceOrderRequest(orderName);
        }

        public PlaceOrderCommand createOrderCommand() {
            return new PlaceOrderCommand();
        }
    }
}
