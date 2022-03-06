package com.elba.peachstore.order.domain;

import com.elba.peachstore.order.domain.dto.StarbucksCardDto;

public interface StarbucksCardRepository {
    StarbucksCardDto save(StarbucksCardDto starbucksCard);
    StarbucksCardDto findByCardId(String cardId);
}
