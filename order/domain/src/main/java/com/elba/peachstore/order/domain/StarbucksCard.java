package com.elba.peachstore.order.domain;

import com.elba.peachstore.order.domain.dto.StarbucksCardDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class StarbucksCard {

    private String cardId;

    private boolean trdYN;
    private boolean changeCardNumber;
    private boolean cardStatus;
    private String pinNo;
    private Integer balance;

    public StarbucksCard(boolean trdYN, boolean changeCardNumber, boolean cardStatus, String pinNo, Integer balance) {
        this.trdYN = trdYN;
        this.changeCardNumber = changeCardNumber;
        this.cardStatus = cardStatus;
        this.pinNo = pinNo;
        this.balance = balance;
    }

    public abstract boolean checkCancel(FDChecker fdCheck);

    public void activate(Integer amount, Fiserve fiserve) {
        // 카드 정보를 가져오고(카드NO, PIN No, Sequence)
        // 주문금액을 마스터테이블에 업데이트 한다.
        try {
            fiserve.activate(this.cardId);
            this.balance = amount;
        } catch (Exception E) {
            new throw Exception("ZZZZ");
        }

    }
}
