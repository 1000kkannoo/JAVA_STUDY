package my.study.testcode.spring.api.service.order;

import lombok.RequiredArgsConstructor;
import my.study.testcode.spring.api.controller.order.request.OrderCreateRequest;
import my.study.testcode.spring.api.service.order.response.OrderResponse;
import my.study.testcode.spring.domain.order.Order;
import my.study.testcode.spring.domain.order.OrderRepository;
import my.study.testcode.spring.domain.product.Product;
import my.study.testcode.spring.domain.product.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public OrderResponse createOrder(OrderCreateRequest request, LocalDateTime registeredDateTime) {
        List<String> productNumbers = request.getProductNumbers();
        List<Product> products = productRepository.findAllByProductNumberIn(productNumbers);

        Order order = Order.create(products, registeredDateTime);
        Order savedOrder = orderRepository.save(order);

        return OrderResponse.of(savedOrder);
    }
}
