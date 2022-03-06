package com.elba.peachstore.order.domain.dto;

import com.elba.peachstore.order.domain.StarbucksCard;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StarbucksCardOracleDto {

    @Id
    private String cardId;

    private boolean trdYN;
    private boolean changeCardNumber;
    private boolean cardStatus;

    public StarbucksCardOracleDto fromStarbucksCard(StarbucksCard starbucksCard) {
        return null;
    }

    public StarbucksCard toStarbucksCard() {
        //Factory Method
        return null;
    }
}
