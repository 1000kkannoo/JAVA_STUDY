package practice1.view;

import practice1.model.Order;

import java.util.Scanner;

public class OutputView {
    public void printOrderStart() {
        System.out.println("===== 안녕하세요! 주문을 시작합니다 =====");
    }

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
}
