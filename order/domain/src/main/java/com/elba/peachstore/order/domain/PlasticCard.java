package com.elba.peachstore.order.domain;

public class PlasticCard extends StarbucksCard{

    private String owner;

    @Override
    public boolean checkCancel(FDChecker fdCheck) {
        if( this.isCardStatus() || !owner.equals("바보") ) {
            return true;
        }
        return false;
    }
}
