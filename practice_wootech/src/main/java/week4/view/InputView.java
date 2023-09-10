package week4.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        return Integer.parseInt(sc.nextLine());
    }

}
