package main.level0;

import java.util.Scanner;

public class 덧셈식_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%s + %s = %s", a, b, a + b);
    }
}
