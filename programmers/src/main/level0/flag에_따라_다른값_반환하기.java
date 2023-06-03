package main.level0;

public class flag에_따라_다른값_반환하기 {
    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
    }

    private static int solution(int a, int b, boolean flag) {
        return (flag) ? a + b : a - b;
    }
}
