package com.elba.peachstore.order.infrastructure.infrastructure;

import com.elba.peachstore.order.domain.aggregate.Orderer;
import com.elba.peachstore.order.domain.service.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class MemberRestfulAPIRepository implements MemberRepository {
    @Override
    public Orderer findByMemberId(String memberId) {
        //TODO Resttemplate, Restful Get.... API as Repository.
        //a,b,c,d,e,f,
        // return new Orderer(a,b,c);
        return null;
    }
}
