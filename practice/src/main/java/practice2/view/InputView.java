package practice2.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public Integer inputSelectAction() {
        return Integer.parseInt(sc.nextLine());
    }

    public Integer inputSelectMenuNumber() {
        System.out.println("상세 조회할 메뉴 번호를 입력해주세요");
        return Integer.parseInt(sc.nextLine());
    }

    public Integer inputOrderNumber() {
        System.out.println("주문할 음식의 번호를 입력해주세요");
        return Integer.parseInt(sc.nextLine());
    }

    public Integer inputReadOrderNumber() {
        System.out.println("상세 조회할 주문 번호를 입력해주세요");
        return Integer.parseInt(sc.nextLine());
    }
}
