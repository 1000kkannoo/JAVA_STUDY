package main.level0;

import java.util.Scanner;

public class 피타고라스의_정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c * c) - (a * a);

        System.out.println(b_square);
    }
}
