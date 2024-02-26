package main.level0;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int sum = 1;

        for (int i = 1; i <= 10; i++) {
            sum *= i;
            if (sum > n) {
                return i - 1;
            }
        }

        return 10;
    }
}
