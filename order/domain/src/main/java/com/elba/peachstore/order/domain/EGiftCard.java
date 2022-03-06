package com.elba.peachstore.order.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EGiftCard extends StarbucksCard {

    public EGiftCard(boolean trdYN, boolean changeCardNumber, boolean cardStatus) {
        super(trdYN, changeCardNumber, cardStatus);
    }

    @Override
    public boolean checkCancel(FDChecker fdCheck) {

        boolean compareStatue = fdCheck.compare(this.getCardId());

        if( this.isTrdYN() & this.isCardStatus() & this.isChangeCardNumber() & compareStatue) {
            return true;
        } else {
            return false;
        }
    }
}
