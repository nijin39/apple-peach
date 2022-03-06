package com.elba.peachstore.order.application;

import com.elba.peachstore.order.domain.EGiftCard;
import com.elba.peachstore.order.domain.FDChecker;
import com.elba.peachstore.order.domain.StarbucksCard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StarbucksCardCancelService {

    @Autowired
    private FDChecker fdChecker;

    public boolean egiftCardCancel(String egiftCardId) {

        StarbucksCard starbucksCard = new EGiftCard(true, true, true);
        //StarbucksCard starbucksCard = StarbucksCardRepository.findById("00001"); --> EGiftCard
        boolean status = starbucksCard.checkCancel(fdChecker);
        log.info(String.valueOf(status));
        return status;

    }
}
