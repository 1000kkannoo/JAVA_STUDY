package practice2.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public Integer inputSelectAction() {
        return Integer.parseInt(sc.nextLine());
    }
}
