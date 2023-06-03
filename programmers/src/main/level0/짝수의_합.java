package main.level0;

public class 짝수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int sum = 0;
        int plus = 2;
        for (int i = 0; i < n / 2; i++) {
            sum += plus;
            plus += 2;
        }
        return sum;
    }
}
