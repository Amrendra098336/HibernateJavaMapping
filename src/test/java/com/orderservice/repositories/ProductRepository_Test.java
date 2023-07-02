package com.orderservice.repositories;

import com.orderservice.domain.OrderHeader;
import com.orderservice.domain.Product;
import com.orderservice.repository.OrderHeaderRepository;
import com.orderservice.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("local")
public class ProductRepository_Test {

    @Autowired
    ProductRepository productRepository;

    @Test
    void testSaveOrder() {
        Product product = Product.builder()
                .description("Dummy")
                .build();

        Product save = productRepository.save(product);

        Assertions.assertThat(save).isNotNull();
        assertNotNull(save.getCreatedDate());
        assertNotNull(save.getLastModifiedDate());


    }
}
