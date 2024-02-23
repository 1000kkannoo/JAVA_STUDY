package main.level0;

import static java.lang.Math.*;

public class 주사위_게임_2 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 3));
    }

    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return (int) ((a + b + c) * (pow(a, 2) + pow(b, 2) + pow(c, 2)) * (pow(a, 3) + pow(b, 3) + pow(c, 3)));
        } else if (a == b || a == c || b == c) {
            return (int) ((a + b + c) * (pow(a, 2) + pow(b, 2) + pow(c, 2)));
        }
        return a + b + c;
    }
}
