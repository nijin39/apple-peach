package com.elba.peachstore.order.domain.dto;

import javax.persistence.*;

@Entity
@Table(name="Order")
public class OrderDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
