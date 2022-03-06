package com.elba.peachstore.order.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberInfo {

    private String name;
    private Integer age;
    private Boolean arsAuthenticate;

    public boolean canOrder() {
        return !name.isEmpty() & age > 14 & arsAuthenticate == true;
    }
}
