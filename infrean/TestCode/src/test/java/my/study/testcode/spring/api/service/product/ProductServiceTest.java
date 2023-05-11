package my.study.testcode.spring.api.service.product;

import my.study.testcode.spring.api.controller.product.request.ProductCreateRequest;
import my.study.testcode.spring.api.service.product.response.ProductResponse;
import my.study.testcode.spring.api.service.request.ProductCreateServiceRequest;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductRepository;
import my.study.testcode.spring.domain.product.ProductSellingStatus;
import my.study.testcode.spring.domain.product.ProductType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static my.study.testcode.spring.domain.product.ProductSellingStatus.SELLING;
import static my.study.testcode.spring.domain.product.ProductType.HANDMADE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles(value = "test")
@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @AfterEach
    void tearDown() {
        productRepository.deleteAllInBatch();
    }

    @DisplayName("신규 상품을 등록한다. 상품번호는 가장 최근 상품의 상품번호에서 1 증가한 값이다.")
    @Test
    void createProduct() {
        // given
        Product product1 = createProduct("001", HANDMADE, SELLING, "아메리카노", 4000);
        productRepository.saveAll(List.of(product1));

        ProductCreateServiceRequest request = ProductCreateServiceRequest.builder()
                .type(HANDMADE)
                .sellingStatus(SELLING)
                .name("카푸치노")
                .price(5000)
                .build();

        // when
        ProductResponse productResponse = productService.createProduct(request);

        // then
        assertThat(productResponse)
                .extracting("productNumber", "type", "sellingStatus","name","price")
                .contains("002",HANDMADE,SELLING,"카푸치노",5000);

        List<Product> products = productRepository.findAll();

        assertThat(products).hasSize(2)
                .extracting("productNumber", "type", "sellingStatus","name","price")
                .containsExactlyInAnyOrder(
                        tuple("001",HANDMADE,SELLING,"아메리카노",4000),
                        tuple("002",HANDMADE,SELLING,"카푸치노",5000)
                );
    }

    @DisplayName("상품이 하나도 없는 경우 신규 상품을 등록하면 상품번호는 001 이다.")
    @Test
    void createProductWhenProductsIsEmpty() {
        // given
        ProductCreateServiceRequest request = ProductCreateServiceRequest.builder()
                .type(HANDMADE)
                .sellingStatus(SELLING)
                .name("카푸치노")
                .price(5000)
                .build();

        // when
        ProductResponse productResponse = productService.createProduct(request);

        // then
        assertThat(productResponse)
                .extracting("productNumber", "type", "sellingStatus","name","price")
                .contains("001",HANDMADE,SELLING,"카푸치노",5000);

        List<Product> products = productRepository.findAll();

        assertThat(products).hasSize(1)
                .extracting("productNumber", "type", "sellingStatus","name","price")
                .contains(
                        tuple("001",HANDMADE,SELLING,"카푸치노",5000)
                );
    }

    private Product createProduct(String productNumber, ProductType type, ProductSellingStatus selling, String name, int price) {
        return Product.builder()
                .productNumber(productNumber)
                .type(type)
                .sellingStatus(selling)
                .name(name)
                .price(price)
                .build();
    }
}