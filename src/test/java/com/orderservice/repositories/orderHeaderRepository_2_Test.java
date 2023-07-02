package com.orderservice.repositories;

import com.orderservice.domain.OrderHeader;
import com.orderservice.repository.OrderHeaderRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("local")
public class orderHeaderRepository_2_Test {

    @Autowired
    OrderHeaderRepository orderHeaderRepository;

    @Test
    void testSaveOrder() {
        OrderHeader orderHeader = OrderHeader.builder().customerName("Test Customer")
                .build();

        OrderHeader save = orderHeaderRepository.save(orderHeader);

        Assertions.assertThat(save).isNotNull();
        assertNotNull(save.getCreatedDate());
        assertNotNull(save.getLastModifiedDate());


    }
}
