package main.level0;

public class 세균_증식 {
    public static void main(String[] args) {
        System.out.println(solution(7, 15));
    }

    private static int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n = n * 2;
        }
        return n;
    }
}
