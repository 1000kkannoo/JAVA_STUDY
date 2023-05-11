package my.study.testcode.spring.api.controller.product.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import my.study.testcode.spring.api.service.request.ProductCreateServiceRequest;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductSellingStatus;
import my.study.testcode.spring.domain.product.ProductType;

import javax.validation.constraints.*;

@Getter
@NoArgsConstructor
public class ProductCreateRequest {

    @NotNull(message = "상품 타입은 필수입니다.")
    private ProductType type;

    @NotNull(message = "상품 판매상태는 필수입니다.")
    private ProductSellingStatus sellingStatus;

    /*
    @NotNull -> "", " " 통과됨
    @NotEmpty -> " " 공백은 통과 "" 이건 통과못함
    */

    // String name -> 상품 이름은 20자 제한
    @NotBlank(message = "상품 이름은 필수입니다.") // null 과 공백 전체를 검사
//    @Max(20) -> 밸리데이션에 대한 책임 분리
    private String name;

    @Positive(message = "상품 가격은 양수여야 합니다.")
    private int price;

    @Builder
    private ProductCreateRequest(ProductType type, ProductSellingStatus sellingStatus, String name, int price) {
        this.type = type;
        this.sellingStatus = sellingStatus;
        this.name = name;
        this.price = price;
    }

    public ProductCreateServiceRequest toServiceRequest() {
        return ProductCreateServiceRequest.builder()
                .type(type)
                .sellingStatus(sellingStatus)
                .name(name)
                .price(price)
                .build();
    }
}
