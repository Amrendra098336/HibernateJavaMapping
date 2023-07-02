package com.orderservice.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderHeaderTest {

    @Test
    void testEquals() {
        OrderHeader orderHeader = new OrderHeader();
        orderHeader.setId(1L);

        OrderHeader orderHeader2 = new OrderHeader();
        orderHeader2.setId(1L);

        assert orderHeader.equals(orderHeader2);
    }

    @Test
    void testNotEquals() {
        OrderHeader orderHeader = new OrderHeader();
        orderHeader.setId(1L);

        OrderHeader orderHeader2 = new OrderHeader();
        orderHeader2.setId(2L);

        assertFalse( orderHeader.equals(orderHeader2));
    }
}