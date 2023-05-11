package my.study.testcode.spring.api.controller.product;

import lombok.RequiredArgsConstructor;
import my.study.testcode.spring.api.ApiResponse;
import my.study.testcode.spring.api.controller.product.request.ProductCreateRequest;
import my.study.testcode.spring.api.service.product.ProductService;
import my.study.testcode.spring.api.service.product.response.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/api/v1/products/new")
    public ApiResponse<ProductResponse> createProduct(
            @Valid @RequestBody ProductCreateRequest request
    ) {
        return ApiResponse.ok(productService.createProduct(request.toServiceRequest()));
    }

    @GetMapping("/api/v1/products/selling")
    public ApiResponse<List<ProductResponse>> getSellingProducts() {
        return ApiResponse.ok(productService.getSellingProducts());
    }
}
