package my.study.testcode.unit;

import my.study.testcode.unit.beverage.Americano;
import my.study.testcode.unit.beverage.Latte;
import my.study.testcode.unit.order.Order;

import java.time.LocalDateTime;

public class CafeKioskRunner {

    public static void main(String[] args) {
        CafeKiosk cafeKiosk = new CafeKiosk();
        cafeKiosk.add(new Americano());
        System.out.println(">>> 아메리카노 추가");

        cafeKiosk.add(new Latte());
        System.out.println(">>> 라떼 추가");

        int totalPrice = cafeKiosk.calculateTotalPrice();
        System.out.println("총 주문 가격 : " + totalPrice);

        cafeKiosk.createOrder(LocalDateTime.now());
    }
}
