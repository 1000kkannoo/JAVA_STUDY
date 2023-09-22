package practice1.view;

import practice1.model.Order;

import java.util.Map;
import java.util.Scanner;

public class InputView {
    public static final String PRODUCT_ID = "pid";
    public static final String QUANTITY = "quantity";
    public static final String PRICE = "price";
    private final Scanner sc;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public Order inputOrder() {
        System.out.println("상품의 이름, 수량, 가격, PID를 공백으로 구분하여 차례대로 입력해주세요");
        String[] orderArr = sc.nextLine().split(" ");

        return new Order(
                Long.parseLong(orderArr[3]),
                orderArr[0],
                Integer.parseInt(orderArr[1]),
                Integer.parseInt(orderArr[2]));
    }

    public Long inputDeleteOrder() {
        System.out.println("주문목록에 삭제할 상품의 PID를 입력해주세요.");
        return Long.parseLong(sc.nextLine());
    }

    public Map<String, Object> inputUpdateOrder() {
        System.out.println("주문목록의 수정할 상품 PID와 수량, 가격을 공백으로 구분하여 차례대로 입력해주세요");
        String[] updateOrderArr = sc.nextLine().split(" ");

        return Map.of(
                PRODUCT_ID, Long.parseLong(updateOrderArr[0]),
                QUANTITY, Integer.parseInt(updateOrderArr[1]),
                PRICE, Integer.parseInt(updateOrderArr[2]));
    }

    public Integer selectProcess() {
        return Integer.parseInt(sc.nextLine());
    }

    public void closeScanner() {
        sc.close();
    }
}
