package com.orderservice.domain;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class Address {

    private String address;
    private String city;
    private String state;
    private String zipcode;
}
