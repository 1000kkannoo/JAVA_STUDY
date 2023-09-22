package practice1.view;

import practice1.model.Order;

import java.util.Map;
import java.util.Scanner;

public class InputView {

    public Order inputOrder() {
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        return Long.parseLong(sc.nextLine());
    }

    public Map<String, Object> inputUpdateOrder() {
        System.out.println("주문목록의 수정할 상품 PID와 수량, 가격을 공백으로 구분하여 차례대로 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String[] updateOrderArr = sc.nextLine().split(" ");

        return Map.of(
                "pid", Long.parseLong(updateOrderArr[0]),
                "quantity", Integer.parseInt(updateOrderArr[1]),
                "price", Integer.parseInt(updateOrderArr[2]));
    }
}
