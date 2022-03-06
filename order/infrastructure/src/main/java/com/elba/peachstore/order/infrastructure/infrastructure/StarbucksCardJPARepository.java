package com.elba.peachstore.order.infrastructure.infrastructure;

import com.elba.peachstore.order.domain.StarbucksCard;
import com.elba.peachstore.order.domain.StarbucksCardRepository;
import com.elba.peachstore.order.domain.dto.StarbucksCardDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarbucksCardJPARepository extends StarbucksCardRepository, JpaRepository<StarbucksCard, String> {
    StarbucksCardDto save(StarbucksCardDto starbucksCardDto);
    StarbucksCardDto findByCardId(String cardId);
}
