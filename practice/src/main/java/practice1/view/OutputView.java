package practice1.view;

import practice1.model.Order;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OutputView {
    public void printOrderProcess() {
        System.out.println("==============================");
        System.out.println("1.주문 생성 2.주문 수정 3.주문 삭제 4.주문목록 조회 5.주문 총 금액 조회 / 0. 종료");
        System.out.println("==============================");
    }

    public void printOrderList(List<Order> orders) {
        AtomicInteger i = new AtomicInteger(1);
        orders.forEach((order) -> {
            System.out.printf("===== 상품 %s =====\n", i.getAndIncrement());
            System.out.printf("PID : %s\n", order.getProductId());
            System.out.printf("주문 상품 이름 : %s\n", order.getProductName());
            System.out.printf("주문 상품 수량 : %s\n", order.getQuantity());
            System.out.printf("주문 상품 가격 : %s\n", order.getPrice());
        });
    }

    public void printAllOrderPrice(Integer sumPrice) {
        System.out.printf("주문 총 금액 : %s\n", sumPrice);
    }

    public void printOrderStart() {
        System.out.println("===== 안녕하세요! 주문을 시작합니다 =====");
    }
}
