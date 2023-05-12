package my.study.testcode.spring.api.service.product;

import lombok.RequiredArgsConstructor;
import my.study.testcode.spring.api.service.product.response.ProductResponse;
import my.study.testcode.spring.api.service.request.ProductCreateServiceRequest;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductRepository;
import my.study.testcode.spring.domain.product.ProductSellingStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/*
 * readOnly = true : 읽기전용
 * CRUD 에서 CUD 동작 X / only Read
 * JPA : CUD 스냅샷 저장, 변경감지 X (성능 향상)
 *
 * CQRS - Command / Query
 */
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductNumberFactory productNumberFactory;

    // 동시성 이슈
    // UUID 를 사용해 유니크하게 해결 할 수도 있다 !
    @Transactional
    public ProductResponse createProduct(ProductCreateServiceRequest request) {
        String nextProductNumber = productNumberFactory.createNextProductNumber();

        Product savedProduct = request.toEntity(nextProductNumber);
        productRepository.save(savedProduct);

        return ProductResponse.of(savedProduct);
    }

    public List<ProductResponse> getSellingProducts() {
        List<Product> products = productRepository.findAllBySellingStatusIn(ProductSellingStatus.forDisplay());
        return products.stream()
                .map(ProductResponse::of)
                .collect(Collectors.toList());
    }
}
