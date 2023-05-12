package my.study.testcode.spring;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.study.testcode.spring.api.controller.order.OrderController;
import my.study.testcode.spring.api.controller.product.ProductController;
import my.study.testcode.spring.api.service.order.OrderService;
import my.study.testcode.spring.api.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = {
        OrderController.class,
        ProductController.class
})
public abstract class ControllerTestSupport {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @MockBean
    protected OrderService orderService;

    @MockBean
    protected ProductService productService;
}
