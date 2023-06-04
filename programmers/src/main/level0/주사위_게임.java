package main.level0;

public class 주사위_게임 {
    public static void main(String[] args) {
        System.out.println(solution(6, 1));
    }

    private static int solution(int a, int b) {
        int answer = 0;
        if (a % 2 != 0 && b % 2 != 0) {
            return (a * a) + (b * b);
        } else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        }
        return Math.abs(a - b);
    }
}
